SUMMARY = "GNU implementation of ((t)ape (ar)chiver)"
DESCRIPTION = "GNU Tar is an archiver program. It is used to create and manipulate files \
that are actually collections of many other files; the program provides \
users with an organized and systematic method of controlling a large amount \
of data. Despite its name, that is an acronym of 'tape archiver', GNU Tar \
is able to direct its output to any available devices, files or other programs, \
it may as well access remote devices or files."
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-1.34-11.1.aarch64.rpm"
RPM_HASH = "a06a63a227c8473654abc68748f80d8e56f02a7e7a75b862be8c3e65dd354ca221ff02de34529397e4012d374ca55d50398ed9d2860cd5c628725e05a6983db6"

RPROVIDES:${PN} += "/usr/bin/tar \
base-/bin/tar \
tar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
