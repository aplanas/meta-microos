SUMMARY = "Libtool Runtime Library"
DESCRIPTION = "Library needed by programs that use the ltdl interface of GNU libtool."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.7"

RPM_NAME = "libltdl7-2.4.7-3.4.aarch64.rpm"
RPM_HASH = "2b040f170e0682afbf6a654e98806d7816959dc4941c7e3c993f0c58924cd5efd8d0e5d1335366b1f5595ff034288166892d60a667dde087367885031860df72"

RPROVIDES:${PN} += "libltdl.so.7 \
libltdl7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
