SUMMARY = "Minimalist variant of UNIX utilities linked in a single executable"
DESCRIPTION = "BusyBox combines tiny versions of many common UNIX utilities into a \
single executable. It provides minimalist replacements for utilities \
usually found in fileutils, shellutils, findutils, textutils, grep, \
gzip, tar, and more. BusyBox provides a fairly complete POSIX \
environment for small or embedded systems. The utilities in BusyBox \
generally have fewer options than their GNU cousins. The options that \
are included provide the expected functionality and behave much like \
their GNU counterparts."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-1.36.1-2.1.aarch64.rpm"
RPM_HASH = "845703ffdaa8bb90b338f940866a4d0a3a6fdb8316cfe38213299fb7b5c9eac043dbf1edbfd32d9ab63885ba3d654c6c5c8ecda1dfecf1abb77a922146da68e4"

RPROVIDES:${PN} += "busybox \
config-busybox \
useradd-or-adduser-dep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libselinux.so.1 \
libsepol.so.2"

inherit rpm
