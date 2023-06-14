SUMMARY = "VPD Database access library for lsvpd"
DESCRIPTION = "The libvpd package contains classes that are used to access a Vital \
Product Data (VPD) database created by vpdupdate in the lsvpd package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.9"

RPM_NAME = "libvpd-2_2-3-2.2.9-3.3.aarch64.rpm"
RPM_HASH = "f2fb814dd5e38c140f0b3efcdb043e60a94fd467a65416847091082b5618e1ad79128c2491ad6a26ded41325140e40e8d312b130c113efc7a59fa7106b46f557"

RPROVIDES:${PN} += "libvpd-2-2-3 \
libvpd-2.2.so.3 \
libvpd-cxx-2.2.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
libvpd-base"

inherit rpm
