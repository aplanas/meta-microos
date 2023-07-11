SUMMARY = "Tool for investigating unknown wireless protocols"
DESCRIPTION = "The Universal Radio Hacker is a software for investigating unknown wireless \
protocols."
LICENSE = "GPL-3.0-only"

PV = "2.9.4"

RPM_NAME = "urh-2.9.4-1.5.aarch64.rpm"
RPM_HASH = "a3400304792364919aabd9744e00b8e3fd42fc0d0c9338567ba21e7755756a121f762294e0bfe3b4a58f1042710bac065f1ce47877283add51e78a3ae76cda45"

RPROVIDES:${PN} += "python3.11dist-urh \
python3dist-urh \
urh"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libLimeSuite.so.22.09-1 \
libairspy.so.0 \
libbladeRF.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhackrf.so.0 \
libm.so.6 \
librtlsdr.so.0 \
libstdc++.so.6 \
libuhd.so.4.4.0 \
python-abi \
python3-Cython \
python3-PyAudio \
python3-numpy \
python3-psutil \
python3-pyzmq \
python3-qt5"

inherit rpm
