SUMMARY = "Japanese handwriting recognition engine"
DESCRIPTION = "Japanese handwriting recognition engine (Tegaki Online MOji-ninshiki \
Engine)"
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-0.6.0-51.5.aarch64.rpm"
RPM_HASH = "64f42bd52c6deeb4f0edf3da765126b378b20ffa67fe33077932c1036dc9c3b508b2c08f6ac6db836212fc99cf602f34c90b9be790e1c20c58f9b001e96697fa"

RPROVIDES:${PN} += "libtomoe.so.0 \
tomoe"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
