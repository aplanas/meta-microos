SUMMARY = "Modeling and fitting package for scientific data analysis"
DESCRIPTION = "Sherpa is the CIAO modeling and fitting application. It enables the \
user to construct models from definitions and fit those models to \
data, using a variety of statistics and optimization methods."
LICENSE = "GPL-3.0-only"

PV = "4.15.1"

RPM_NAME = "python39-sherpa-4.15.1-1.2.aarch64.rpm"
RPM_HASH = "1fce114432d0b4cd80b4b8534405168679c1435ac354b2d22bbc780e4bc58c1dacf917eed384f1690a292cfb5ef8c12fe8087d5d0320435dbf0d7872729156de"

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
