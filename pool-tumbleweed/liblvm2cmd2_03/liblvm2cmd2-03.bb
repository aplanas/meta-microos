SUMMARY = "LVM2 command line library"
DESCRIPTION = "The lvm2 command line library allows building programs that manage \
lvm devices without invoking a separate program."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "liblvm2cmd2_03-2.03.16-7.1.aarch64.rpm"
RPM_HASH = "781612317a16a6036118e10ed04d331e15fa81c2c26826c571e4bdbc693781361b6610d2131aa39f3ad989da889205ade7ad65e95cbf74889ae3122e8c2f9e36"

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
