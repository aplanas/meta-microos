SUMMARY = "Python binding to poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained."
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python39-poppler-qt5-21.3.0-1.13.aarch64.rpm"
RPM_HASH = "7327b9c64bba8b50c4aa75107389c8fe0aff6898493e3315b1df0aec92b6551d945cc8509c717b695eea0c62774201ae864e0bda4e40c1cd961aa4ff54a55ecd"

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
