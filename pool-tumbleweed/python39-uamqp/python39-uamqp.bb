SUMMARY = "AMQP 10 Client Library for Python"
DESCRIPTION = "AMQP 1.0 Client Library for Python"
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "python39-uamqp-1.6.4-1.5.aarch64.rpm"
RPM_HASH = "4d63ee2f9fdf249f0eafd796875434117bff7105e8db68e4aef0bdddbea5567c2129cba5eb3b34c025d8f69a651f82fbfe7ef1633227c9dadd6961242a584902"

RPROVIDES:${PN} += "python3.9dist(uamqp) \
python39-uamqp \
python39-uamqp(aarch-64) \
python3dist(uamqp)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
python(abi) \
python39-certifi"

inherit rpm
