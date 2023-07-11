SUMMARY = "Vala bindings to libmirage"
DESCRIPTION = "libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package contains the Vala bindings to libmirage"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "libmirage-vala-3.2.6-1.9.noarch.rpm"
RPM_HASH = "6757b0bdab7a25ee04c37e7d9a3516a475c880cca869c11e1b2588b45f2876cc6fd47abc64c9f4b30a95a399c6f215744fc7921603f4c87c280020e22559ccaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libmirage-vala"

RDEPENDS:${PN} += ""

inherit rpm
