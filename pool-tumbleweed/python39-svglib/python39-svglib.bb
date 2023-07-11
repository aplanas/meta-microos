SUMMARY = "Python library for reading and converting SVG"
DESCRIPTION = "Pure Python library for reading and converting SVG."
LICENSE = "LGPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "python39-svglib-1.1.0-2.10.noarch.rpm"
RPM_HASH = "d488b53314f4e6d973af9975b12cbf786938ff2f26edf1b3723c8c0c52a2b97cd75b8e50a3bb2b98d4121cd0cf02d7006f2975e7b52fc8b583af501b309e9b19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-svglib \
python39-svglib \
python3dist-svglib"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-cssselect2 \
python39-lxml \
python39-reportlab \
python39-tinycss2 \
update-alternatives"

inherit rpm
