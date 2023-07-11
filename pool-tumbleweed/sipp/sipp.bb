SUMMARY = "A SIP protocol testing tool"
DESCRIPTION = "Sipp is a performance testing tool for the SIP protocol. Its main features are \
basic SIPStone scenarios, TCP/UDP transport, customizable (xml based) scenarios, \
dynamic adjustement of call-rate and a comprehensive set of real-time \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.1"

RPM_NAME = "sipp-3.6.1-1.15.aarch64.rpm"
RPM_HASH = "ea55c430d41370f2ea21f1adcbf81733d62f7c7d16abb7506d217ba90e6b46c2d0bcc3d5f615313fb9bc5a6de6a231e34dc9d85c08b19e3bc948f576ef567866"

RPROVIDES:${PN} += "sipp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libncursesw.so.6 \
libpcap.so.1 \
libsctp.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
