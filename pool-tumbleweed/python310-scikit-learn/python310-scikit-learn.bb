SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python310-scikit-learn-1.3.0-3.1.aarch64.rpm"
RPM_HASH = "f9246e95aeae9b741a2dbd1d5b04d94a0be599c7456fa6a2b2956760ccde61c0aed7abc4a5159062f30c3fe387563def2161549882a360d3aadeea59635daa42"

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
