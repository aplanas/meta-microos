SUMMARY = "openSUSE Base Package"
DESCRIPTION = "This package installs several important configuration files and central scripts."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230329.b39efbc"

RPM_NAME = "aaa_base-84.87+git20230329.b39efbc-1.1.aarch64.rpm"
RPM_HASH = "28f10649db3b9d4e67d0b89a2446aa59d94144a4933421038368c6406f1b1f3cb9ac311660e74362fe6b43a64944ab451cd02b82f9b607e0d043e789593aa3b0"

RPROVIDES:${PN} += "/sbin/service \
aaa_base \
aaa_base(aarch-64) \
config(aaa_base)"
RDEPENDS:${PN} += "(glibc >= 2.30 if glibc) \
/bin/bash \
/bin/mktemp \
/bin/sh \
/usr/bin/cat \
/usr/bin/date \
/usr/bin/grep \
/usr/bin/mv \
/usr/bin/sed \
/usr/bin/tput \
/usr/bin/xz \
distribution-release \
filesystem \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
