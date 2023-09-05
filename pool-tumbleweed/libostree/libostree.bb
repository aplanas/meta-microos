SUMMARY = "Git for operating system binaries"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.6"

RPM_NAME = "libostree-2023.6-1.1.aarch64.rpm"
RPM_HASH = "4e6df5cd15cdefb4d12edba9ccbdda5c14273a99f853a01967caa55f2e6d615bb48236c33b6114cf855540630531b444e11a2750f1ca22daf278fa09bed28b42"

RPROVIDES:${PN} += "config-libostree \
libostree \
ostree"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libfuse3.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libostree-1.so.1 \
libsodium.so.23 \
libsystemd.so.0"

inherit rpm
