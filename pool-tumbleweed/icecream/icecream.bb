SUMMARY = "Distributed Compilation in the Network"
DESCRIPTION = "Distributed compiler with a central scheduler to share build load."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "icecream-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "cc134ecefd821d22a9b770421a806d70322af2374de4dd260d495998ffc42a6f4fc6ebd8eb0040f280e7757fd1ad1b4476fb6a691b188b3a9d9d7c6fcbe5d2da"

RPROVIDES:${PN} += "config(icecream) \
icecream \
icecream(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/bin/tar \
/usr/bin/bzip2 \
/usr/bin/mkdir \
/usr/bin/touch \
/usr/sbin/groupadd \
/usr/sbin/useradd \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libcap-ng.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
liblzo2.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libzstd.so.1()(64bit) \
logrotate \
systemd"

inherit rpm
