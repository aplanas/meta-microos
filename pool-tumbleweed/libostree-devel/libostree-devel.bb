SUMMARY = "Git for operating system binaries -- Development files"
DESCRIPTION = "OSTree is a tool for managing bootable, immutable, versioned \
filesystem trees. While it takes over some of the roles of tradtional \
'package managers' like dpkg and rpm, it is not a package system; nor \
is it a tool for managing full disk images. Instead, it sits between \
those levels, offering a blend of the advantages (and disadvantages) \
of both."
LICENSE = "LGPL-2.0-or-later"

PV = "2023.6"

RPM_NAME = "libostree-devel-2023.6-1.1.aarch64.rpm"
RPM_HASH = "4959c48485729d85ba02baaccc0f5ea6626d3d33d95311c21f5d602011f9736960bbbbf929ad515ddee8f3cb2b03054f6cf230f61036d01533dc9b5469802dd9"

RPROVIDES:${PN} += "libostree-devel \
ostree-devel \
pkgconfig-ostree-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libostree-1-1 \
pkgconfig-gio-unix-2.0 \
typelib-1-0-OSTree-1-0"

inherit rpm
