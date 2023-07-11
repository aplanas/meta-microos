SUMMARY = "Proactor library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "libqpid-proton-proactor1-0.38.0-1.6.aarch64.rpm"
RPM_HASH = "d266e29d71b0a0c3a67905fbea84d0fe292e756f3dc1c9f01d7bd3d4364ea97078864ecebc3d22a15d719084dc2729ade63bec6b76e6c74fa8954b83052addb1"

RPROVIDES:${PN} += "libqpid-proton-proactor.so.1 \
libqpid-proton-proactor1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libqpid-proton-core.so.10"

inherit rpm
