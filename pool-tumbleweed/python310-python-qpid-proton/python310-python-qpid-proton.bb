SUMMARY = "Python language bindings for the Qpid Proton messaging framework"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "python310-python-qpid-proton-0.38.0-1.4.aarch64.rpm"
RPM_HASH = "822483d973fd16001980ea7425539d279dae1ef818981503799c8c6bc23ecdf1b90c84d3896fb29fb181582f7c8ee4789719b8fabbccf43507a41734de4002b5"

RPROVIDES:${PN} += "python3-python-qpid-proton \
python3-qpid-proton \
python3.10dist(python-qpid-proton) \
python310-python-qpid-proton \
python310-python-qpid-proton(aarch-64) \
python310-qpid-proton \
python3dist(python-qpid-proton)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libqpid-proton11 \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
python(abi)"

inherit rpm
