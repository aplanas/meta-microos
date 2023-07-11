SUMMARY = "Git for operating system binaries"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-1-1-2023.2-2.2.aarch64.rpm"
RPM_HASH = "453e469fa9ded1ec474489868c7268ced9a154c7c6e54f45ffb924f394acb069b061c6d7d42c9da7575f159b65c001c67f046ce6846f905c5a108cc640ae025f"

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
