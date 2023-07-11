SUMMARY = "Corosync configuration map library"
DESCRIPTION = "The CMAP library is used to interact with the configuration database \
used by Corosync. The library provides a mechanism to \
create/chage/remove keys, iterate over them and track changes to \
keys."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcmap4-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "ac244a594cff0c1f140732f9dca77b3ceafef9ba6794c51700fec74750ffb9a88ad34ef249d2dfede31ec9bd9f95bb8c39493dde77c340089dbf7a8413b829a1"

RPROVIDES:${PN} += "libcmap.so.4 \
libcmap4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcorosync-common.so.4 \
libqb.so.100"

inherit rpm
