SUMMARY = "Tool for investigating unknown wireless protocols"
DESCRIPTION = "The Universal Radio Hacker is a software for investigating unknown wireless \
protocols."
LICENSE = "GPL-3.0-only"

PV = "2.9.4"

RPM_NAME = "urh-2.9.4-1.4.aarch64.rpm"
RPM_HASH = "eaeb3365c020c7d068431cf97623268f412f0172e6c80002349b90ce9221dc6d463631a9f51e62f2820815870c85c2eaa3ecf3df7e6c51f9af6e3a271559eb74"

RPROVIDES:${PN} += "python3.10dist-urh \
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
