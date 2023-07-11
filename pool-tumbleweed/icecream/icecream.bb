SUMMARY = "Distributed Compilation in the Network"
DESCRIPTION = "Distributed compiler with a central scheduler to share build load."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "icecream-1.4.0-2.6.aarch64.rpm"
RPM_HASH = "184ce01d2441a51c279ad564b4e91f441beaa432fd70294dcb8b62bc050a163e220a1805d16ca11f1fa7f52016bcca896856edd299a3d5752486baefe4da3fd0"

RPROVIDES:${PN} += "config-icecream \
icecream"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/bzip2 \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/tar \
/usr/bin/touch \
/usr/sbin/groupadd \
/usr/sbin/useradd \
fillup \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcap-ng.so.0 \
libgcc-s.so.1 \
liblzo2.so.2 \
libstdc++.so.6 \
libzstd.so.1 \
logrotate \
systemd"

inherit rpm
