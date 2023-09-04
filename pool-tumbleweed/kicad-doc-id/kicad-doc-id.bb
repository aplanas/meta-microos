SUMMARY = "Indonesian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Indonesian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-id-7.0.6-1.1.noarch.rpm"
RPM_HASH = "153a31311a621b66ecd7f1f07d2e19f378523d298a97fecea8455b6941b6aaef2a6f383dfbaf1bd4f6781337626cbe371439555ef2d579e554b682422b4e547f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-id \
locale-kicad-doc-id"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
