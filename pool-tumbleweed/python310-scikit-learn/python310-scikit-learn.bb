SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python310-scikit-learn-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "df9eced7c3f5c43727d2758e8d8eb47bac42a15cbd2694479f50e19800e49bbc3d712c68437aab3df0e0bae7f6eb420462d31cf8aa8d458cd225517ab9aa756d"

RPROVIDES:${PN} += "python3.10dist-scikit-learn \
python310-scikit-learn \
python310-sklearn \
python3dist-scikit-learn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-joblib \
python310-numpy \
python310-scipy \
python310-threadpoolctl \
python310-xml"

inherit rpm
