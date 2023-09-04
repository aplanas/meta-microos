SUMMARY = "Italian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Italian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.6"

RPM_NAME = "kicad-doc-it-7.0.6-1.1.noarch.rpm"
RPM_HASH = "d6045354bdd36823804cfd3ae60b628961b164ce28655bf7711d67bf3dc35d32ec32264cccd20977529b4e9a63ffcecb1b21a025c087e22637e598e0a80c1d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-it \
locale-kicad-doc-it"

RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
