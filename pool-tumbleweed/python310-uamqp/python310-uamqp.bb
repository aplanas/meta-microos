SUMMARY = "AMQP 10 Client Library for Python"
DESCRIPTION = "AMQP 1.0 Client Library for Python"
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "python310-uamqp-1.6.4-1.7.aarch64.rpm"
RPM_HASH = "5c53f5e00c0896f37b2619d517f90ea582a08aa660ed1ccfae4d38d2ce14a46784b67c0d699d251965a69c12cff60a0a61954fa610e2bdc9f9c74f3988e3114f"

RPROVIDES:${PN} += "python3.10dist-uamqp \
python310-uamqp \
python3dist-uamqp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
python-abi \
python310-certifi"

inherit rpm
