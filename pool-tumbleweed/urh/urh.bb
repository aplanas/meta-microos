SUMMARY = "Tool for investigating unknown wireless protocols"
DESCRIPTION = "The Universal Radio Hacker is a software for investigating unknown wireless \
protocols."
LICENSE = "GPL-3.0-only"

PV = "2.9.4"

RPM_NAME = "urh-2.9.4-1.4.aarch64.rpm"
RPM_HASH = "eaeb3365c020c7d068431cf97623268f412f0172e6c80002349b90ce9221dc6d463631a9f51e62f2820815870c85c2eaa3ecf3df7e6c51f9af6e3a271559eb74"

RPROVIDES:${PN} += "application() \
application(urh.desktop) \
python3.10dist(urh) \
python3dist(urh) \
urh \
urh(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLimeSuite.so.22.09-1()(64bit) \
libairspy.so.0()(64bit) \
libbladeRF.so.2()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libhackrf.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
librtlsdr.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libuhd.so.4.4.0()(64bit) \
python(abi) \
python3-Cython \
python3-PyAudio \
python3-numpy \
python3-psutil \
python3-pyzmq \
python3-qt5"

inherit rpm
