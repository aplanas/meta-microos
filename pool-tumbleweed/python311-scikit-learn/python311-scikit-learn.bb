SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-scikit-learn-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "a1dd7aa2608f6402d9bc801b539ceb707e8b69e345e6b20d7ccbea3aae1af5b51d769c200518df2a8a3aafae42fb94fa27bfd3140c77cda54ae0c00a5e55132f"

RPROVIDES:${PN} += "python3.11dist-scikit-learn \
python311-scikit-learn \
python311-sklearn \
python3dist-scikit-learn"

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
