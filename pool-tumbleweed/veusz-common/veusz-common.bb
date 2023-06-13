SUMMARY = "Common example and icons for all python flavors of veusz"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. \
 \
This package provides datafiles, examples, and icons used by all \
python flavours of veusz."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "3.6.2"

RPM_NAME = "veusz-common-3.6.2-1.1.noarch.rpm"
RPM_HASH = "0b13a129d9dfb1c875ebdb3f68de3c321f416b4c5944b0767db3cfde4c85776bf823a6145baba1d9902f5a585c4583a7b9ebd5654021384a5b28ad4215b87021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "veusz-common"

RDEPENDS:${PN} += ""

inherit rpm
