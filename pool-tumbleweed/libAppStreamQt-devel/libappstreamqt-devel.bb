SUMMARY = "Header files for AppStream's Qt5 bindings"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using the Qt bindings for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.2"

RPM_NAME = "libAppStreamQt-devel-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "aeb5c1d83c5e98541021c5a2f7f656b2d2af95d0852a955114de3073d5931d0be112fdeb9d166ece250b85c79c2af55ff90fdb61cf0f942d3484fa4ffdb2b1cb"

RPROVIDES:${PN} += "cmake-AppStreamQt \
libAppStreamQt-devel"

RDEPENDS:${PN} += "libAppStreamQt2 \
libappstream4"

inherit rpm
