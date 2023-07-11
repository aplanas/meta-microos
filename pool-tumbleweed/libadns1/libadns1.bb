SUMMARY = "Advanced DNS resolver client library"
DESCRIPTION = "Libadns is an advanced, easy to use, asynchronous-capable DNS resolver \
client library for C (and C++) programs."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libadns1-1.6.0-1.13.aarch64.rpm"
RPM_HASH = "8c090f94f2bc9469451810f9fd184cd3cf6e11e88437dd50015c7c1fc8fd06eaeaa548fa90e8dcd288cd2c65259c225a2a86e8f9cd0bd009e9ab0ce64c786917"

RPROVIDES:${PN} += "libadns \
libadns.so.1 \
libadns1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
