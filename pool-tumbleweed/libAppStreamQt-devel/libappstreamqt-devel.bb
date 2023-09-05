SUMMARY = "Header files for AppStream's Qt5 bindings"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools (with manual pages) needed to \
compile and link applications using the Qt bindings for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "libAppStreamQt-devel-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "72b52e38ab97a2768fc8f9bc41cbe977e46c70fb68b1cc29638543a17bca9559aafe252fecab3068c8dd9d922ef7d78368172b0357103991ff497287a9c04f83"

RPROVIDES:${PN} += "cmake-AppStreamQt \
libAppStreamQt-devel"

RDEPENDS:${PN} += "libAppStreamQt2 \
libappstream4"

inherit rpm
