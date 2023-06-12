SUMMARY = "Core library for Qpid Proton"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "libqpid-proton-core10-0.38.0-1.4.aarch64.rpm"
RPM_HASH = "5b4fe2c0f6837f9ba0b06c4b7c75bc17111f9224411ca0a341758b5f92064db365e7652617db0f33b43039a20725ccd694ce886445cd0b5a47ae517c0e3f386d"

RPROVIDES:${PN} += "libqpid-proton-core.so.10()(64bit) \
libqpid-proton-core10 \
libqpid-proton-core10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
