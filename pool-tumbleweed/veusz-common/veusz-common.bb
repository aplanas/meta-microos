SUMMARY = "Common example and icons for all python flavors of veusz"
DESCRIPTION = "Veusz is a scientific plotting package, designed to create \
publication-ready Postscript/PDF/SVG output. \
 \
This package provides datafiles, examples, and icons used by all \
python flavours of veusz."
LICENSE = "GPL-2.0-or-later & Python-2.0"

PV = "3.6.2"

RPM_NAME = "veusz-common-3.6.2-1.2.noarch.rpm"
RPM_HASH = "7284fd917cec4ffb778a2cd20fad0aaaad171af26b83d4b18bc3d4b864032b8cf8422440a58bd69cd9844d4a94667b57027e425748cd3319fc5c80535317a208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "veusz-common"

RDEPENDS:${PN} += ""

inherit rpm
