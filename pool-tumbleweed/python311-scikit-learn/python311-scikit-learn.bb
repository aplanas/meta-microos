SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python311-scikit-learn-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "51f2eb8fe67e8dd5715e2d9b7e0f88ac438b87bfc9fb39a28e623666abceebefbcab9180cd273d67fcf2a6fd9efae141736d2ffb77b33dd01c57eb854ffe79e9"

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
