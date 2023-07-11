SUMMARY = "Python library for reading and converting SVG"
DESCRIPTION = "Pure Python library for reading and converting SVG."
LICENSE = "LGPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "python311-svglib-1.1.0-2.10.noarch.rpm"
RPM_HASH = "b46cc044c09d35cc7bb4898b9e55a29e9006df5ebd4fbb1ee4ec4fff009bdf3cf82b3f973a559adae3adddcd68374097cf980dfa3051d22d5eb6960a95aed256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svglib \
python3.11dist-svglib \
python311-svglib \
python3dist-svglib"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-cssselect2 \
python311-lxml \
python311-reportlab \
python311-tinycss2 \
update-alternatives"

inherit rpm
