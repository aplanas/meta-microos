SUMMARY = "AMQP 10 Client Library for Python"
DESCRIPTION = "AMQP 1.0 Client Library for Python"
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "python39-uamqp-1.6.4-1.7.aarch64.rpm"
RPM_HASH = "7b9840c50a8f9beb7002fcc40bde6840266e6eb0334ada24817969b5c3ba89e22065bcca540435051d795d167ec6f25bacb7b22d6553ac0aeebb0b16d0475d58"

RPROVIDES:${PN} += "python3.9dist-uamqp \
python39-uamqp \
python3dist-uamqp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
python-abi \
python39-certifi"

inherit rpm
