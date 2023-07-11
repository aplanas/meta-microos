SUMMARY = "AMQP 10 Client Library for Python"
DESCRIPTION = "AMQP 1.0 Client Library for Python"
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "python311-uamqp-1.6.4-1.7.aarch64.rpm"
RPM_HASH = "5a208e40383e5c67ce04f4f5ac75e5e81c0b5fad6db40850f280769ddc9cb1ac1ecd34efeb974c0e9267ad2852a9bdc54b71fbdfd381e425091052c993309063"

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
