SUMMARY = "Object serialization library for cross-language communication"
DESCRIPTION = "MessagePack is a binary-based object serialization library. It enables to \
exchange structured objects between many languages like JSON."
LICENSE = "BSL-1.0"

PV = "4.0.0"

RPM_NAME = "libmsgpackc2-4.0.0-1.3.aarch64.rpm"
RPM_HASH = "edff85fd9e18d1d048635b66a9c5ce5189e8991072ea43bb78caba8558d89c4a0bf13b2a282326df23af75294b6d1450750a90f5371ff4fde7d3a8805e0b59d2"

RPROVIDES:${PN} += "libmsgpackc.so.2()(64bit) \
libmsgpackc2 \
libmsgpackc2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
