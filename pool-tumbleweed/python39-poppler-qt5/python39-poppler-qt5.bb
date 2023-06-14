SUMMARY = "Python binding to poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained."
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python39-poppler-qt5-21.3.0-1.12.aarch64.rpm"
RPM_HASH = "66ee7b58f9a469eeb039323f92066bcee5374152d3655122e9de5d7598aab5fe7922e6790ffd6252015bd0ec54e4aa5da941e94814deddd30f601788d085a540"

RPROVIDES:${PN} += "python3.9dist-python-poppler-qt5 \
python39-poppler-qt5 \
python3dist-python-poppler-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libpoppler-qt5.so.1 \
libstdc++.so.6 \
python-abi \
python39-qt5"

inherit rpm
