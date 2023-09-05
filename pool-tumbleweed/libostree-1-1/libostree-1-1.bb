SUMMARY = "Git for operating system binaries"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.6"

RPM_NAME = "libostree-1-1-2023.6-1.1.aarch64.rpm"
RPM_HASH = "57584456892f62a747a1755dcdbab531bf984cc0e4506ac47daa386282335a2992e1edf24c0306c8ba6b08841d2bac1377cb6b1511fb10d00f77e6706297ed83"

RPROVIDES:${PN} += "libostree-1-1 \
libostree-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgpgme.so.11 \
liblzma.so.5 \
libselinux.so.1 \
libsodium.so.23 \
libsystemd.so.0 \
libz.so.1"

inherit rpm
