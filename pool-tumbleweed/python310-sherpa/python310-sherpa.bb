SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.15.1"

RPM_NAME = "python310-sherpa-4.15.1-1.2.aarch64.rpm"
RPM_HASH = "3623fd33c8be4420b9f49290edf9a250b405435a620b630912250e9112a34d0ae72acd009d0efcc455b3d92bb6848662122949881a47e0b05d62500a7a99211e"

RPROVIDES:${PN} += "python3.10dist-sherpa \
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
