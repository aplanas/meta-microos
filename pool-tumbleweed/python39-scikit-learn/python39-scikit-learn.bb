SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python39-scikit-learn-1.3.0-3.1.aarch64.rpm"
RPM_HASH = "5b71ea48fa16053ec3b9d788922cdbc25584d14be34193510675abaf68d46f17a938edb4bd8423633e937bb3df2ddfec1b80400a468af9c278f6f212c19b1394"

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
