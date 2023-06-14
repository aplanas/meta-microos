SUMMARY = "AMQP 10 Client Library for Python"
DESCRIPTION = "AMQP 1.0 Client Library for Python"
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "python311-uamqp-1.6.4-1.5.aarch64.rpm"
RPM_HASH = "f1e4ee6a9ad7258f4ef8fd0eb7ccec5df92163323c9f689ba800d91ed6ac3076f159974bbb60311bc81c60000f458b0c4dabc1f7023770c110559cdeeedbb0da"

RPROVIDES:${PN} += "python3.11dist-uamqp \
python311-uamqp \
python3dist-uamqp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
python-abi \
python311-certifi"

inherit rpm
