SUMMARY = "Python library for reading and converting SVG"
DESCRIPTION = "Pure Python library for reading and converting SVG."
LICENSE = "LGPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "python310-svglib-1.1.0-2.10.noarch.rpm"
RPM_HASH = "1d7a4ac083958fb7d856071a48938825975cb76f349bbaee95e88a5e9474d416a533314ecff18c892587369b1efb31de127c667b9144b6f17a5bf8cd82f74154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-svglib \
python310-svglib \
python3dist-svglib"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-cssselect2 \
python310-lxml \
python310-reportlab \
python310-tinycss2 \
update-alternatives"

inherit rpm
