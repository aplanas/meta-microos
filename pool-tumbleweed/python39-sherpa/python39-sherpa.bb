SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.15.1"

RPM_NAME = "python39-sherpa-4.15.1-1.1.aarch64.rpm"
RPM_HASH = "7f6a70e1189660fa142c52a2636bd21393a848465f1cd42b0e4b96e808b881b208599c00e9de32bc5fd170e80fef562b05ce30739675698bbab83bbdecaa3e3f"

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
