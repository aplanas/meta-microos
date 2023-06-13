SUMMARY = "Client library for AMQP"
DESCRIPTION = "This is a C-language AMQP client library for use with AMQP servers \
speaking protocol versions 0-9-1."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "librabbitmq4-0.11.0-3.7.aarch64.rpm"
RPM_HASH = "05b832bb37abe97d8594a125388bde204821f4e93496e7b8e4cf5ea30d1fbb8347c3fe64c18a2d709d69a8a847bcdaa662a49291d236143b8ae2132aabc7373f"

RPROVIDES:${PN} += "librabbitmq.so.4()(64bit) \
librabbitmq4 \
librabbitmq4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libssl.so.3()(64bit)"

inherit rpm
