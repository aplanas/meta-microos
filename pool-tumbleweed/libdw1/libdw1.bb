SUMMARY = "Library to access DWARF debugging information"
DESCRIPTION = "This package provides a high-level library to access the DWARF debugging \
information. This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdw1-0.189-3.3.aarch64.rpm"
RPM_HASH = "5d9dd0fd110fd04bf552497a187137f59899c84c22398ef95c8b76244e0d69d758cc7f268407e5ae239b448eb280a18b81464360a3060ec6761794d34e33d149"

RPROVIDES:${PN} += "libdw.so.1 \
libdw1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libelf.so.1 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1"

inherit rpm
