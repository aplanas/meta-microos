SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python39-scikit-learn-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "a625a6d6e1b817cf4c0ec0610b4af441220e2fca188fd30cde4f59535928793c36b6e8f2d27d2849e89c18f86274ce9e808847427b113b3f4ff320c8f37195f7"

RPROVIDES:${PN} += "python3.9dist-scikit-learn \
python39-scikit-learn \
python39-sklearn \
python3dist-scikit-learn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-joblib \
python39-numpy \
python39-scipy \
python39-threadpoolctl \
python39-xml"

inherit rpm
