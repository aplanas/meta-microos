SUMMARY = "Python language bindings for the Qpid Proton messaging framework"
DESCRIPTION = "Proton is a messaging library. It can be used in brokers, client \
libraries, routers, bridges and proxies. Proton is based on the AMQP \
1.0 messaging standard."
LICENSE = "Apache-2.0"

PV = "0.38.0"

RPM_NAME = "python311-python-qpid-proton-0.38.0-1.4.aarch64.rpm"
RPM_HASH = "8c55c965df8d5109eff05a6e8668c0dfe47572f5cf43a597a2a2e6ba99e97e9f0eb8451bf1338b3fc317d409fbe57c173f9629fe60898a329db2318409ac7ee0"

RPROVIDES:${PN} += "python3.11dist(python-qpid-proton) \
python311-python-qpid-proton \
python311-python-qpid-proton(aarch-64) \
python311-qpid-proton \
python3dist(python-qpid-proton)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libpython3.11.so.1.0()(64bit) \
libqpid-proton-core.so.10()(64bit) \
libqpid-proton11 \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
python(abi)"

inherit rpm
