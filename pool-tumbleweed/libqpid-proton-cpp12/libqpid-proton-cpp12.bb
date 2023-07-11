SUMMARY = "C++ library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "libqpid-proton-cpp12-0.38.0-1.6.aarch64.rpm"
RPM_HASH = "aaa5bcb4a83b4abf70d2a8775c77dc489b543b18472b697a45c894c1f654267dc1b80b8718dcbe5b38a86ac44e9d9f0fe9576a36f5796c78180d3a03cf4f77cc"

RPROVIDES:${PN} += "libqpid-proton-cpp.so.12 \
libqpid-proton-cpp12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqpid-proton-core.so.10 \
libqpid-proton-proactor.so.1 \
libstdc++.so.6"

inherit rpm
