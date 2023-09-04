SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python311-scikit-learn-1.3.0-3.1.aarch64.rpm"
RPM_HASH = "d32bd4317a69b0abc6d2feea3258e08eb339161d8a36326712c5e0bdcacafefc4570c85be6ec6a8013d7933239b766cec88703e3d6c177d9f20157c94706f18a"

RPROVIDES:${PN} += "python3-scikit-learn \
python3-sklearn \
python3.11dist-scikit-learn \
python311-scikit-learn \
python311-sklearn \
python3dist-scikit-learn \
sklearn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-joblib \
python311-numpy \
python311-scipy \
python311-threadpoolctl \
python311-xml"

inherit rpm
