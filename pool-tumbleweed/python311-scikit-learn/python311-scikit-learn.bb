SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-scikit-learn-1.2.1-2.3.aarch64.rpm"
RPM_HASH = "be17dbab96ca5c217c058c8f94ac193937c3e6f8c8e046a3a0e7de2d8859b6f71336a0559f2fe15c1547ad180d4b26988bdcdd4f7867f3269c4b73f64ea00861"

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
