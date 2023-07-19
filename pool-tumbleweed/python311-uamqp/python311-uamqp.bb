SUMMARY = "AMQP 10 Client Library for Python"
DESCRIPTION = "AMQP 1.0 Client Library for Python"
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "python311-uamqp-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "058d83de9cb46a7b6253dcfc9d30d1c53b8ca829fba1e300cae6af88e47a0b54bbf06cbe0eca9c6cb7535bbac13032f51652f00e7a16f6832e0e0af1d1cb3c04"

RPROVIDES:${PN} += "python3-uamqp \
python3.11dist-uamqp \
python311-uamqp \
python3dist-uamqp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
python-abi \
python311-certifi"

inherit rpm
