SUMMARY = "Git for operating system binaries -- Development files"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.2"

RPM_NAME = "libostree-devel-2023.2-2.2.aarch64.rpm"
RPM_HASH = "66d53dec99db8239bbc8cdc90a10221aed93d86263c3917f9695bdb964061f137826c6c52d3687f0db4a58226d992ebd0f2ded5c5dd260a54fbd6d0f10f5e8e6"

RPROVIDES:${PN} += "libostree-devel \
ostree-devel \
pkgconfig-ostree-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libostree-1-1 \
pkgconfig-gio-unix-2.0 \
typelib-1-0-OSTree-1-0"

inherit rpm
