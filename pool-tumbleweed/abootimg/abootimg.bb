SUMMARY = "Android boot image manipulator"
DESCRIPTION = "Android boot image manipulator. It can create/update/unpack boot.img - boot \
file used by Android OS."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "0.6"

RPM_NAME = "abootimg-0.6-9.8.aarch64.rpm"
RPM_HASH = "c3b846878e73dc93ec3c174f9cdd497fcc043c42abb6d2cd5db70ded646a7ce18619c7c0d150f59a2683dcedaf57cc703fc8369545a6f6fa4e91e5fc6b6171f6"

RPROVIDES:${PN} += "abootimg \
abootimg(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm