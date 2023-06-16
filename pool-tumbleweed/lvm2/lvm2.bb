SUMMARY = "Logical Volume Manager Tools"
DESCRIPTION = "Programs and man pages for configuring and using the LVM2 Logical \
Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-2.03.16-6.3.aarch64.rpm"
RPM_HASH = "eed9fcf846908cbd44cbd4214f56a09e36ef18a105349c17dc3473bd5c0a00ce844dfa9220f9940e144d7dfbc9e92236d04a9c37f86d6d40790dfde9a60197af"

RPROVIDES:${PN} += "config-lvm2 \
libdevmapper-event-lvm2.so.2.03 \
libdevmapper-event-lvm2mirror.so.2.03 \
libdevmapper-event-lvm2raid.so.2.03 \
libdevmapper-event-lvm2snapshot.so.2.03 \
libdevmapper-event-lvm2thin.so.2.03 \
libdevmapper-event-lvm2vdo.so.2.03 \
lvm \
lvm2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
device-mapper \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6 \
libdevmapper-event.so.1.03 \
libdevmapper.so.1.03 \
liblvm2cmd.so.2.03 \
libreadline.so.8 \
libselinux.so.1 \
libsystemd.so.0 \
libudev.so.1 \
modutils \
systemd"

inherit rpm
