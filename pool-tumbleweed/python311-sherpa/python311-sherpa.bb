SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.15.1"

RPM_NAME = "python311-sherpa-4.15.1-1.2.aarch64.rpm"
RPM_HASH = "269099c0ef1af726885b02a219cea0da5640395c6d0d62e9e8455b11e284b2ddf818f3c1d2ddbc2319738ec242b98961d5a8abfd910538fea213cb8710987382"

RPROVIDES:${PN} += "python3-sherpa \
python3.11dist-sherpa \
python311-sherpa \
python3dist-sherpa"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
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
