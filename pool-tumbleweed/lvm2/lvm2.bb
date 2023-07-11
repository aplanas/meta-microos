SUMMARY = "Logical Volume Manager Tools"
DESCRIPTION = "Programs and man pages for configuring and using the LVM2 Logical \
Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-2.03.16-7.1.aarch64.rpm"
RPM_HASH = "773557cc9bf186d8aeacfd00a2a74c50bfa5ff92b5d8e6fee29d7655fc1d797b5633f98440a3863a34fd811d6830c4ee30e1932a553b11f26fb403b4854bde0a"

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
