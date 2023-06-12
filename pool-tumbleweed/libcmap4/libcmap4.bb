SUMMARY = "Corosync configuration map library"
DESCRIPTION = "The CMAP library is used to interact with the configuration database \
used by Corosync. The library provides a mechanism to \
create/chage/remove keys, iterate over them and track changes to \
keys."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libcmap4-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "c37aa19344b8405d2feba8f04d8a14d222d1a614c3315876614ca81e78c818cd37f294b42371483979d46999dea416a7c27b5e370ae60f8eefdb5ec32cd22dbc"

RPROVIDES:${PN} += "libcmap.so.4()(64bit) \
libcmap.so.4(COROSYNC_CMAP_1.0)(64bit) \
libcmap4 \
libcmap4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcorosync_common.so.4()(64bit) \
libqb.so.100()(64bit)"

inherit rpm
