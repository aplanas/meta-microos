SUMMARY = "Python binding to poppler-qt5"
DESCRIPTION = "A Python binding for libpoppler-qt5 that aims for completeness \
and for being actively maintained."
LICENSE = "LGPL-2.1-or-later"

PV = "21.3.0"

RPM_NAME = "python310-poppler-qt5-21.3.0-1.13.aarch64.rpm"
RPM_HASH = "82deea24f1eacdcd239f6625b902c13a9b6ce6bcfaac028b1f8f87ada6bcf2cfa492037f637a53b31fa0d65d635afaf696d7a6a2c4ccf0b6068898188353f1ff"

RPROVIDES:${PN} += "python3.10dist-python-poppler-qt5 \
python310-poppler-qt5 \
python3dist-python-poppler-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libpoppler-qt5.so.1 \
libstdc++.so.6 \
python-abi \
python310-qt5"

inherit rpm
