SUMMARY = "FCoE userspace management tools"
DESCRIPTION = "Userspace tools to manage FibreChannel over Ethernet (FCoE) \
connections."
LICENSE = "GPL-2.0-only"

PV = "1.0.34"

RPM_NAME = "fcoe-utils-1.0.34-4.8.aarch64.rpm"
RPM_HASH = "87da35f65453324822dcc4813ce2fa763a7c73bf2139d15fdd1388b4a9ccf7d238ac8fc3849c5ab9cd064094093b64826c60d80ca75a282308fe52b238f1783f"

RPROVIDES:${PN} += "config-fcoe-utils \
fcoe-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
device-mapper \
fillup \
iproute \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpciaccess.so.0 \
open-lldp \
pkgconfig-systemd \
systemd"

inherit rpm
