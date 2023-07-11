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

RPM_NAME = "i18nspector-0.26-2.9.noarch.rpm"
RPM_HASH = "77037016934d943ed3101a90c49ba58045b2c7ccbc748c1973138866f0689287dcf4943ed6da5a968832e0ca66cef6a5fe31b6c61dc152e1ea052c5ea31e0eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "i18nspector"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-polib \
python3-rply"

inherit rpm
