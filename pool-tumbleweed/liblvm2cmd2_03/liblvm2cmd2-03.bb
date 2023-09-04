SUMMARY = "LVM2 command line library"
DESCRIPTION = "The lvm2 command line library allows building programs that manage \
lvm devices without invoking a separate program."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "liblvm2cmd2_03-2.03.16-8.1.aarch64.rpm"
RPM_HASH = "276cf17682c48a6cd09f8c361a1ee28a01b8ca11fca6a71225fff4e3af6691fb131f6fd8a468d3c8a278827c5e7dd2812efefdd4969b7ea07d497c75b13c6def"

RPROVIDES:${PN} += "liblvm2cmd.so.2.03 \
liblvm2cmd2-03"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6 \
libdevmapper-event.so.1.03 \
libselinux.so.1 \
libsystemd.so.0 \
libudev.so.1"

inherit rpm
