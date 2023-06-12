SUMMARY = "FireWire 1394 support for audio devices, svn snapshot"
DESCRIPTION = "FFADO aims to provide a generic, open-source solution \
to support FireWire(IEEE1394, iLink) based (semi-) \
professional audio interfaces. \
It's the successor of the FreeBoB project. FFADO is a \
volunteer-based community effort, trying to provide Linux \
with at least the same level of functionality that is \
present on the other operating systems. \
The range of FireWire Audio Devices that we would like \
to support is broad: from pure audio interfaces over \
mixed audio-control devices to DSP algorithm devices. \
This is a snapshot of svn revision 1855"
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3"

RPM_NAME = "ffado-2.4.3-3.1.aarch64.rpm"
RPM_HASH = "ef164197e0031deee40fbf28589c7618fd734bac4499b22897b2b2eba038a9746e6f67afd595683f0bd0c02f4f5de7f9e86266ea3a16340b8084bcd844914ef0"

RPROVIDES:${PN} += "ffado \
ffado(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdbus-c++-1.so.1()(64bit) \
libffado.so.2()(64bit) \
libffado2 \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libiec61883.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libraw1394.so.11()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
