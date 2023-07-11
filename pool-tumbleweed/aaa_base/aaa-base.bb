SUMMARY = "openSUSE Base Package"
DESCRIPTION = "This package installs several important configuration files and central scripts."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230329.b39efbc"

RPM_NAME = "aaa_base-84.87+git20230329.b39efbc-1.2.aarch64.rpm"
RPM_HASH = "b0f66b9df2fb473fbdb9758bce525efd624837ecd57ac2023fb3001c95408442d73a33ab466563aa1735960f2843cf159d54dde8dc99652be4cde6b63e9f250a"

RPROVIDES:${PN} += "/sbin/service \
aaa-base \
config-aaa-base"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/cat \
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
