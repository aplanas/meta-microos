SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-scikit-learn-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "b707d7ecba746db5ee4decba1ddd459ec7c1186e81888835bcc37591e4a36a35d9892fb7d4997a1fabdd22db85b50a34265e8ba3ee8f90fbd00cbf6f6f4d26bf"

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
