SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-scikit-learn-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "b997ab326fa12266c8d3732e1b2c630466793191e9be0e6802e81201439c3832f0f1ac27fb2c5beb9f3182cc6d444014ccb1f3fc896a23afc899cd5dffe8b779"

RPROVIDES:${PN} += "python3-scikit-learn \
python3-sklearn \
python3.10dist(scikit-learn) \
python310-scikit-learn \
python310-scikit-learn(aarch-64) \
python310-sklearn \
python3dist(scikit-learn) \
sklearn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python310-joblib \
python310-numpy \
python310-scipy \
python310-threadpoolctl \
python310-xml"

inherit rpm
