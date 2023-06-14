SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.15.1"

RPM_NAME = "python311-sherpa-4.15.1-1.1.aarch64.rpm"
RPM_HASH = "bab1126b737c903c80e3ca2c7a2ad9b78d33d98831d3bd5e1f9aaa0cfe79ed83778c2493525ecc0faeb2af1941b8c88064b74e94a6b98e4d99d77c52818c92c3"

RPROVIDES:${PN} += "python3.11dist-sherpa \
python311-sherpa \
python3dist-sherpa"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python311-numpy \
update-alternatives"

inherit rpm
