SUMMARY = "Git for operating system binaries"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-1-1-2023.2-2.1.aarch64.rpm"
RPM_HASH = "3603a69273e5df9e0b391a87d2ab042381555040ba5f9a6e8f2780693ee2f6284b30f358aeecda8b606c5a40c469b8ec5bc0639e02ca60c23a511c62d050e1d8"

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
libgpgme.so.11 \
liblzma.so.5 \
libselinux.so.1 \
libsodium.so.23 \
libsystemd.so.0 \
libz.so.1"

inherit rpm
