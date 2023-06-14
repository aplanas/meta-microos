SUMMARY = "LVM2 command line library"
DESCRIPTION = "The lvm2 command line library allows building programs that manage \
lvm devices without invoking a separate program."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "liblvm2cmd2_03-2.03.16-6.3.aarch64.rpm"
RPM_HASH = "b2973a8a4253fbd83337d7219c769edf08343bc53a980b2c61023b44b40e0e5ab57fabce5d9db15b0a8d7d3713ac50014e7d1439ed0c965b49f8c6ea30b64724"

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
