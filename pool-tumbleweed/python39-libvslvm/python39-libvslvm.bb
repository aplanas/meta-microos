SUMMARY = "Library to access the Linux Logical Volume Manager (LVM) volume system"
DESCRIPTION = "libvslvm is a library to access the Linux Logical Volume Manager \
(LVM) volume system."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python39-libvslvm-20221025-3.7.aarch64.rpm"
RPM_HASH = "a6780f4b6a5a2054b1c12a9e7dafca262b807df5f4c5150da260d636a613b9e08fac059c1387a2d59ec0743561d96afeabbd6b12741da0d52bcb2ec4dffafef2"

RPROVIDES:${PN} += "python39-libvslvm \
python39-libvslvm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libvslvm.so.1()(64bit) \
libvslvm.so.1(V_20221025)(64bit) \
python(abi)"

inherit rpm
