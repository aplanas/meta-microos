SUMMARY = "Tool for Checking gettext POT/PO/MO Files"
DESCRIPTION = "i18nspector is a tool for checking translation templates (POT), message \
catalogues (PO) and compiled message catalogues (MO) files for common \
problems. These files are used by the GNU gettext translation functions \
and tools in many different development environments. \
 \
Checks include: incorrect or inconsistent character encoding, missing \
headers, incorrect language codes and improper plural forms."
LICENSE = "MIT"

PV = "0.26"

RPM_NAME = "i18nspector-0.26-2.8.noarch.rpm"
RPM_HASH = "c1fd64eeed860d4f56cd33e9c44e643772ee832c85109aa27e649c2a2b817f3f3e7353ccec1c438fe280363908ae88f1c783bee987ad1dff3b304c6f2ce28d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "i18nspector"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-polib \
python3-rply"

inherit rpm
