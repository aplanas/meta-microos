SUMMARY = "Object serialization library for cross-language communication"
DESCRIPTION = "MessagePack is a binary-based object serialization library. It enables to \
exchange structured objects between many languages like JSON."
LICENSE = "BSL-1.0"

PV = "4.0.0"

RPM_NAME = "libmsgpackc2-4.0.0-1.4.aarch64.rpm"
RPM_HASH = "54ba4352e6285eb0bd89a455a9ca0516346a977c8485ac32466e52489f5b87c9ed1aa067260a3a56233359f186ab751c425a37d18434ebdcead338b63b99c882"

RPROVIDES:${PN} += "libmsgpackc.so.2 \
libmsgpackc2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
