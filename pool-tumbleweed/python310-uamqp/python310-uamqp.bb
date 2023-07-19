SUMMARY = "AMQP 10 Client Library for Python"
DESCRIPTION = "AMQP 1.0 Client Library for Python"
LICENSE = "MIT"

PV = "1.6.5"

RPM_NAME = "python310-uamqp-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "3292aacade5fa472bcdf68366df43f0f54e8b8a78673f188519497bae96bb6c4bac9ff9a32cad15c7ab7770f345bc99c25de1eb27dd49f41e9453e4ab7f2af52"

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
