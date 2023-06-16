SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.15.1"

RPM_NAME = "python310-sherpa-4.15.1-1.1.aarch64.rpm"
RPM_HASH = "a72e84a560aad8142bd53c86c743aba12f7d33695c7c18b2907b518ea07044e20e84a7a2c729016c4fcff1e4c3464b776ce695c06fb67302b90f549b8ac6a8d4"

RPROVIDES:${PN} += "python3-sherpa \
python3.10dist-sherpa \
python310-sherpa \
python3dist-sherpa"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
