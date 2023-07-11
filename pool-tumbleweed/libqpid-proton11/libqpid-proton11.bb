SUMMARY = "C library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "libqpid-proton11-0.38.0-1.6.aarch64.rpm"
RPM_HASH = "1933d10f86f79c01a7775637fdc5314094e4379464d7a8a91f989ef148ce13a888161590b45094b1818caa5c98ed1232ed95973283f0a5e3d7e612e7440eb848"

RPROVIDES:${PN} += "libqpid-proton.so.11 \
libqpid-proton11"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
