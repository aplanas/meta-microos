SUMMARY = "Core library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "libqpid-proton-core10-0.38.0-1.6.aarch64.rpm"
RPM_HASH = "c3ed0f304b95e0d5dc8cea2c24f988a6a054f03c348e99f2efde6f5dc0473372419f87ea5067b900a02f5078886ad2cea492754dfea6201907567831be35e5ab"

RPROVIDES:${PN} += "libqpid-proton-core.so.10 \
libqpid-proton-core10"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
