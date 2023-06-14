SUMMARY = "Spanish documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Spanish documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-doc-es-7.0.5-1.1.noarch.rpm"
RPM_HASH = "02303ea93118b6cd480a2134f3e7b5435d806bd270304ca1332e51dfb03da86e4ca5a71073d6f62425964b744b45ce73a9f5ff3b5c6a62cb6178c48832ce803b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-es \
locale-kicad-doc-es"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
