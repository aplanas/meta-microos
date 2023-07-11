SUMMARY = "Evolution Data Server backend for libfolks"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "libfolks-eds26-0.15.6-1.2.aarch64.rpm"
RPM_HASH = "9543d838df07f348f755ca9daa4746ea175f9e6c2f11adaf5ba9bcd04c3022a9eaa99db4cee5155bb83471884046c0dc9d0ba7f1f4762548dbd2e8a6a23516db"

RPROVIDES:${PN} += "libfolks-eds.so.26 \
libfolks-eds26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.4 \
libedataserver-1.2.so.27 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
