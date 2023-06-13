SUMMARY = "IRC support for Telepathy"
DESCRIPTION = "Telepathy-idle provides IRC support for Telepathy."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.2"

RPM_NAME = "telepathy-idle-0.2.2-1.12.aarch64.rpm"
RPM_HASH = "7583d344a28d1bb0d5f5951dc0bd8aabfa0ce6d9776cdf4a74f351b7bc13a4a996eb4ccc873024a264623501ee61662d88d9922791cf0c455b09a8b5f5a0faa3"

RPROVIDES:${PN} += "telepathy-idle \
telepathy-idle(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libtelepathy-glib.so.0()(64bit)"

inherit rpm
