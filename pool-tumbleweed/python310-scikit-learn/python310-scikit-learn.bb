SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-scikit-learn-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "7a83f2e1c43af6b8bf0c3e5f4528ecdaff5f26944171c994208b529f827d8b32ff19ff0336640c48d272113b61d14b96daafb44baf22c4dc19d2f968bae6089d"

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
