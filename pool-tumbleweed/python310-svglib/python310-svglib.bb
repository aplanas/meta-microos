SUMMARY = "Python library for reading and converting SVG"
DESCRIPTION = "Pure Python library for reading and converting SVG."
LICENSE = "LGPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "python310-svglib-1.1.0-2.8.noarch.rpm"
RPM_HASH = "e18023bce56f9ebb16357429cf8edd5aaf120f25324fae4942b18830765bd135a67d346716d4c1fa60951706c2bedf5f6a681e79dde2a9101967b60189363143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svglib \
python3.10dist-svglib \
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
