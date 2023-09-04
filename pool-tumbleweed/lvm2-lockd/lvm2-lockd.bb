SUMMARY = "LVM locking daemon"
DESCRIPTION = "LVM commands use lvmlockd to coordinate access to shared storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-lockd-2.03.16-8.1.aarch64.rpm"
RPM_HASH = "9a6552da89d124cdaa3307854010c1ea258c63df76493b5e99ea143098b3d33e3f125945d10c70e6a0839e4dc88fdc25df72308998daf0fe38e28cbef77d6806"

RPROVIDES:${PN} += "lvm2-lockd"

RDEPENDS:${PN} += "/usr/bin/sh \
corosync \
device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdlm \
libdlm-lt.so.3 \
libdlmcontrol.so.3 \
libsanlock-client.so.1 \
libsystemd.so.0 \
libudev.so.1 \
lvm2 \
sanlock \
systemd"

inherit rpm
