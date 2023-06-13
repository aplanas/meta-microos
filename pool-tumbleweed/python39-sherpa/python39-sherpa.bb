SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.15.1"

RPM_NAME = "python39-sherpa-4.15.1-1.1.aarch64.rpm"
RPM_HASH = "7f6a70e1189660fa142c52a2636bd21393a848465f1cd42b0e4b96e808b881b208599c00e9de32bc5fd170e80fef562b05ce30739675698bbab83bbdecaa3e3f"

RPROVIDES:${PN} += "python3.9dist(sherpa) \
python39-sherpa \
python39-sherpa(aarch-64) \
python3dist(sherpa)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfftw3.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python39-numpy \
update-alternatives"

inherit rpm
