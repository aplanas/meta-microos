SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-scikit-learn-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "80c0bc6924eb87630462a2f1cfce9a277f55f7159b273c9b07d5bd6699fd99387968935c025996ccc2984783b49286f9a75d4c2a921d9b337a648c2aa9add5f4"

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
