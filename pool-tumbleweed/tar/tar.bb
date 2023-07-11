SUMMARY = "GNU implementation of ((t)ape (ar)chiver)"
DESCRIPTION = "GNU Tar is an archiver program. It is used to create and manipulate files \
that are actually collections of many other files; the program provides \
users with an organized and systematic method of controlling a large amount \
of data. Despite its name, that is an acronym of 'tape archiver', GNU Tar \
is able to direct its output to any available devices, files or other programs, \
it may as well access remote devices or files."
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-1.34-10.4.aarch64.rpm"
RPM_HASH = "6b1aed6b3a136de4337009d1738ec0cc2203a6238827cabb420fb318fc1c64e43409436c18f35f706359bee1351da6396a75d330543ef0b3adf982e10fc5dd92"

RPROVIDES:${PN} += "/usr/bin/tar \
base-/bin/tar \
tar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
