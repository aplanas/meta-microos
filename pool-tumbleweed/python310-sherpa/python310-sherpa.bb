SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.15.1"

RPM_NAME = "python310-sherpa-4.15.1-2.1.aarch64.rpm"
RPM_HASH = "98b77c8e872b2fffa2ca9f5b286a2b86b2125bc9ad931b854c97abefb66661f1133ba588355446e1e7ad9eb3240672a35e754390e300fba02243314de21eaccc"

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
