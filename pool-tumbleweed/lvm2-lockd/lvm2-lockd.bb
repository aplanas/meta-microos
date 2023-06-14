SUMMARY = "LVM locking daemon"
DESCRIPTION = "LVM commands use lvmlockd to coordinate access to shared storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-lockd-2.03.16-6.3.aarch64.rpm"
RPM_HASH = "b76a4bbb92da8def7e7d644efacc82af32831002b60ade4af9db95ab8e6c42d12a4e228696afb93a473f801f6b18fb60c70a33ad1190d49e6d6816e4fadf97dd"

RPROVIDES:${PN} += "lvm2-lockd"

RDEPENDS:${PN} += "/bin/sh \
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
