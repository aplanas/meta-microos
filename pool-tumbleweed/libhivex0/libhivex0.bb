SUMMARY = "Windows Registry Hive extraction library"
DESCRIPTION = "Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "libhivex0-1.3.23-2.6.aarch64.rpm"
RPM_HASH = "5b20314e1a2143e46667051058a02e61d903c54ebef8170edd9877737a2f59083dcc856751d9b2661f7bfe8b4456510c562a4d69b475423477a6201e22c49033"

RPROVIDES:${PN} += "libhivex.so.0 \
libhivex0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
