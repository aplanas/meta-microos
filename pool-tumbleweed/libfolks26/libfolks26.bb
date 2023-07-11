SUMMARY = "Library to create metacontacts from multiple sources"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "libfolks26-0.15.6-1.2.aarch64.rpm"
RPM_HASH = "4eb235cf28c90722ba418ae7c6022970904c93ea4128ea0ae8bb02de78596717e2e92acc45a683d9a68717104add22c7bd42d1a3dd3e491cf5a6584a914a0719"

RPROVIDES:${PN} += "folks \
libfolks-dummy.so.26 \
libfolks.so.26 \
libfolks26"

RDEPENDS:${PN} += "/sbin/ldconfig \
folks-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libebook-contacts-1.2.so.4 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6"

inherit rpm
