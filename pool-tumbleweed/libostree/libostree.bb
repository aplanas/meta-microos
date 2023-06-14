SUMMARY = "Git for operating system binaries"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-2023.2-2.1.aarch64.rpm"
RPM_HASH = "48c6b8007ce1de517e79afecb76c201de37580750278c8da87c8490a37b5f7b0be45ec6540d6b99b018b1ff8a09628e1b68fda7eace275a305e21f83d2f6878d"

RPROVIDES:${PN} += "libostree \
ostree"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
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
