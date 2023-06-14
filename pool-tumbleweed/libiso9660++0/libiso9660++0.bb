SUMMARY = "Library for working with ISO 9660 filesystems"
DESCRIPTION = "A library for working with ISO 9660 filesystems, which are mainly used on CDs. \
This subpackage contains the C++ API library for cdio."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libiso9660++0-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "305739cc8332b820d960ab0ba3151f5024a21c893b5f25d96c43338a5cfa3b754781c9b6e98d53603bfdeb55ca2f36944e4b5e84a303a1d18c456dc9c5fefa9f"

RPROVIDES:${PN} += "libiso9660++.so.0 \
libiso9660++0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libgcc-s.so.1 \
libiso9660.so.11 \
libstdc++.so.6"

inherit rpm
