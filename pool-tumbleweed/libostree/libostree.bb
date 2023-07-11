SUMMARY = "Git for operating system binaries"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-2023.2-2.2.aarch64.rpm"
RPM_HASH = "20e7a7308042cff4f6d30be83c89422f7d6fd6089fe2e7548bb68a06559113a6a6eb4a9f55c8e8878f45cb78c1d47a80365bfdc60371844ba004dad94e125ae9"

RPROVIDES:${PN} += "libostree \
ostree"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libfuse.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libostree-1.so.1 \
libsystemd.so.0"

inherit rpm
