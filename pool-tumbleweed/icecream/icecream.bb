SUMMARY = "Distributed Compilation in the Network"
DESCRIPTION = "Distributed compiler with a central scheduler to share build load."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "icecream-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "cc134ecefd821d22a9b770421a806d70322af2374de4dd260d495998ffc42a6f4fc6ebd8eb0040f280e7757fd1ad1b4476fb6a691b188b3a9d9d7c6fcbe5d2da"

RPROVIDES:${PN} += "config-icecream \
icecream"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/bin/tar \
/usr/bin/bzip2 \
/usr/bin/mkdir \
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
