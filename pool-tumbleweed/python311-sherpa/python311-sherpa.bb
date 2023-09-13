SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.15.1"

RPM_NAME = "python311-sherpa-4.15.1-2.1.aarch64.rpm"
RPM_HASH = "802dc59495a651bb39faa9835e23bfc8dc7bb082e07ac8a71b6bcaccfeafa9e88a8c4ee422ab3fc7224eb9993819d4b6ce8bb15a33f5c9f5578599af1b01f920"

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
