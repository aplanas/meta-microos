SUMMARY = "FCoE userspace management tools"
DESCRIPTION = "Userspace tools to manage FibreChannel over Ethernet (FCoE) \
connections."
LICENSE = "GPL-2.0-only"

PV = "1.0.34"

RPM_NAME = "fcoe-utils-1.0.34-4.7.aarch64.rpm"
RPM_HASH = "a32a7871af1fb56047dad3854487aa84c057749c79777d6f058e5c31eb018458319ed4f6ff81e841a576a8cf651bfd6ee0bd3ab66580a4bdf9c1b0a56cb223da"

RPROVIDES:${PN} += "config(fcoe-utils) \
fcoe-utils \
fcoe-utils(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
device-mapper \
fillup \
iproute \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpciaccess.so.0()(64bit) \
open-lldp \
pkgconfig(systemd) \
systemd"

inherit rpm
