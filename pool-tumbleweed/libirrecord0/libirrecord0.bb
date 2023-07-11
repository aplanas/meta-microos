SUMMARY = "LIRC record library"
DESCRIPTION = "The LIRC record library. To actually use the lirc plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "libirrecord0-0.10.1-10.2.aarch64.rpm"
RPM_HASH = "d19ced62c722b9a8cd0958815578482f4f38045ec4f2aebb99c57f16f6af5841a2dca003b6e743ec1c9e1c8cead5f72e6977c2b558512e88b3f4725b3baecbff"

RPROVIDES:${PN} += "libirrecord.so.0 \
libirrecord0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblirc.so.0"

inherit rpm
