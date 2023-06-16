SUMMARY = "GNU implementation of ((t)ape (ar)chiver)"
DESCRIPTION = "GNU Tar is an archiver program. It is used to create and manipulate files \
that are actually collections of many other files; the program provides \
users with an organized and systematic method of controlling a large amount \
of data. Despite its name, that is an acronym of 'tape archiver', GNU Tar \
is able to direct its output to any available devices, files or other programs, \
it may as well access remote devices or files."
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-1.34-10.3.aarch64.rpm"
RPM_HASH = "f7b2c04e6cd8b5506d86ccd33ad06769c8cc53cf3438c793bfeaf528d695c4481ee1090fbf8a5a0f680db785041425d81d6f2f3b07cac9114221ed08e4eaeef3"

RPROVIDES:${PN} += "/usr/bin/tar \
base-/bin/tar \
tar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
