SUMMARY = "Python library for reading and converting SVG"
DESCRIPTION = "Pure Python library for reading and converting SVG."
LICENSE = "LGPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "python39-svglib-1.1.0-2.8.noarch.rpm"
RPM_HASH = "ac06de4e0876f806cb126167429b0a91a0098c7f1b6713978ffa82c88c1c291ca2d3db1d04fc4327bc3485d240d9398146b7f6ea4d97515a4471f5904e86d622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-svglib \
python39-svglib \
python3dist-svglib"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-cssselect2 \
python39-lxml \
python39-reportlab \
python39-tinycss2 \
update-alternatives"

inherit rpm
