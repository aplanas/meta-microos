SUMMARY = "Logical Volume Manager Tools"
DESCRIPTION = "Programs and man pages for configuring and using the LVM2 Logical \
Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-2.03.16-6.3.aarch64.rpm"
RPM_HASH = "eed9fcf846908cbd44cbd4214f56a09e36ef18a105349c17dc3473bd5c0a00ce844dfa9220f9940e144d7dfbc9e92236d04a9c37f86d6d40790dfde9a60197af"

RPROVIDES:${PN} += "config(lvm2) \
libdevmapper-event-lvm2.so.2.03()(64bit) \
libdevmapper-event-lvm2.so.2.03(Base)(64bit) \
libdevmapper-event-lvm2mirror.so.2.03()(64bit) \
libdevmapper-event-lvm2mirror.so.2.03(Base)(64bit) \
libdevmapper-event-lvm2raid.so.2.03()(64bit) \
libdevmapper-event-lvm2raid.so.2.03(Base)(64bit) \
libdevmapper-event-lvm2snapshot.so.2.03()(64bit) \
libdevmapper-event-lvm2snapshot.so.2.03(Base)(64bit) \
libdevmapper-event-lvm2thin.so.2.03()(64bit) \
libdevmapper-event-lvm2thin.so.2.03(Base)(64bit) \
libdevmapper-event-lvm2vdo.so.2.03()(64bit) \
libdevmapper-event-lvm2vdo.so.2.03(Base)(64bit) \
lvm \
lvm2 \
lvm2(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
coreutils \
device-mapper \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaio.so.1()(64bit) \
libaio.so.1(LIBAIO_0.1)(64bit) \
libaio.so.1(LIBAIO_0.4)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_1.0)(64bit) \
libblkid.so.1(BLKID_2.15)(64bit) \
libblkid.so.1(BLKID_2.17)(64bit) \
libblkid.so.1(BLKID_2.23)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdevmapper-event.so.1.03()(64bit) \
libdevmapper-event.so.1.03(Base)(64bit) \
libdevmapper.so.1.03()(64bit) \
libdevmapper.so.1.03(Base)(64bit) \
liblvm2cmd.so.2.03()(64bit) \
liblvm2cmd.so.2.03(Base)(64bit) \
libreadline.so.8()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_233)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
modutils \
systemd"

inherit rpm
