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

RPM_NAME = "busybox-1.36.1-1.1.aarch64.rpm"
RPM_HASH = "57d552e5eaba1a356136f0b1d1295e8cee0ee7270340727b030ab02a93bd5e0e93416750a45024f30bbead2be1fcda95a12218b7a8dd0dae03512b6391d38aad"

RPROVIDES:${PN} += "busybox \
config-busybox \
useradd-or-adduser-dep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libselinux.so.1 \
libsepol.so.2"

inherit rpm
