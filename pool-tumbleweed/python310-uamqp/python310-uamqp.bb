SUMMARY = "AMQP 10 Client Library for Python"
DESCRIPTION = "AMQP 1.0 Client Library for Python"
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "python310-uamqp-1.6.4-1.5.aarch64.rpm"
RPM_HASH = "dfaa51d81a7175ec03a79b9ca776845f4fdc481c12e280ef3747e33a878419e49284d41585705009d8ad092d80a4fbec683c4f3d3dbc3bd37a4a3716f216b531"

RPROVIDES:${PN} += "python3-uamqp \
python3.10dist(uamqp) \
python310-uamqp \
python310-uamqp(aarch-64) \
python3dist(uamqp)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
python(abi) \
python310-certifi"

inherit rpm
