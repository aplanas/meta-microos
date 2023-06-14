SUMMARY = "C++ library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "libqpid-proton-cpp12-0.38.0-1.4.aarch64.rpm"
RPM_HASH = "21dc281e045e146724e9388f7d56e99ade148b7b1969d20ebb666ece1ca782691b0af32168abf53bca1fdd20e6f0126efe59b4755fc261ff67ce341a5d56515f"

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
