SUMMARY = "A SIP protocol testing tool"
DESCRIPTION = "Sipp is a performance testing tool for the SIP protocol. Its main features are \
basic SIPStone scenarios, TCP/UDP transport, customizable (xml based) scenarios, \
dynamic adjustement of call-rate and a comprehensive set of real-time \
statistics."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.1"

RPM_NAME = "sipp-3.6.1-1.14.aarch64.rpm"
RPM_HASH = "6f779b1311742ca38f7c3f29118eb693cbb1b7494bbd34d4c1185a6b9ed000f6faa13ba568c57c4fc3577a67df830b805728e9a4ee6f9a5c57e743e84c67eee5"

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
