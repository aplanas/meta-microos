SUMMARY = "openSUSE Base Package"
DESCRIPTION = "This package installs several important configuration files and central scripts."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230815.cab7b44"

RPM_NAME = "aaa_base-84.87+git20230815.cab7b44-1.1.aarch64.rpm"
RPM_HASH = "83d1121169b4b82494ba3d58b6936fd61757b8fe68e8525269598aab8047225e826e16fdbbe571c7443068384a6484673db4afa325e40906bdad317ca152cfff"

RPROVIDES:${PN} += "/sbin/service \
aaa-base \
config-aaa-base"

RDEPENDS:${PN} += "/usr/bin/cat \
/usr/bin/date \
/usr/bin/grep \
/usr/bin/mktemp \
/usr/bin/mv \
/usr/bin/sed \
/usr/bin/sh \
/usr/bin/tput \
/usr/bin/xz \
distribution-release \
filesystem \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
