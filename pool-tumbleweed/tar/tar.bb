SUMMARY = "GNU implementation of ((t)ape (ar)chiver)"
DESCRIPTION = "GNU Tar is an archiver program. It is used to create and manipulate files \
that are actually collections of many other files; the program provides \
users with an organized and systematic method of controlling a large amount \
of data. Despite its name, that is an acronym of 'tape archiver', GNU Tar \
is able to direct its output to any available devices, files or other programs, \
it may as well access remote devices or files."
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-1.34-12.1.aarch64.rpm"
RPM_HASH = "7fd1a3c79b3b2c7ac03db4e73d553f84d77ae31844d0865fd110ec1412e6974a395ebdb4d5473e3cc222fee4d3899f1e1007b96d4c461d6b32f84cd283cd3500"

RPROVIDES:${PN} += "/usr/bin/tar \
base-/bin/tar \
tar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
