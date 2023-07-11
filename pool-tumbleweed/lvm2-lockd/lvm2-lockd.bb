SUMMARY = "LVM locking daemon"
DESCRIPTION = "LVM commands use lvmlockd to coordinate access to shared storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-lockd-2.03.16-7.2.aarch64.rpm"
RPM_HASH = "b16b2657425ff36584dc82daa8d1dc1615f9773ea5ab9d49e378e0ff9da471095951fa09bf6e442d0587e55865d515213e5b1407455f112a0b7892302fc14aaf"

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
