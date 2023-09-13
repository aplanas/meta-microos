SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.15.1"

RPM_NAME = "python39-sherpa-4.15.1-2.1.aarch64.rpm"
RPM_HASH = "3d4d73ec362497ed9bc27e2fdbc5a3ef6705c09150dcb988f37293453f14adc5360e0ec5e8375bab768c36a70efdefce6ad0fe8b9aebbd803358ee5daad4bbeb"

RPROVIDES:${PN} += "python3.9dist-sherpa \
python39-sherpa \
python3dist-sherpa"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python39-numpy \
update-alternatives"

inherit rpm
