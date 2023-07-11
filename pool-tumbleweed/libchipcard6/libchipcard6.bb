SUMMARY = "Library That Allows Access to Smart Cards (Chipcards)"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "libchipcard6-5.1.6-1.12.aarch64.rpm"
RPM_HASH = "dc5b91f50114b9419c1194e84400bb0f0b6568c7ff01ea8bfd5f139f2df22d8748a1553ef209d30c8f640a29b463a65da1dc20fc19737cedf39982c8b7005c8d"

RPROVIDES:${PN} += "libchipcard.so.6 \
libchipcard6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libchipcard \
libgwenhywfar.so.79 \
libpcsclite.so.1 \
libz.so.1"

inherit rpm
