SUMMARY = "Development environment for the ZBar Qt bindings library"
DESCRIPTION = "This package contains all necessary include files, libraries, \
configuration files and development tools needed to compile and link \
applications using the zbar-qt library."
LICENSE = "LGPL-2.0-or-later"

PV = "0.23.90"

RPM_NAME = "libzbarqt-devel-0.23.90-4.1.aarch64.rpm"
RPM_HASH = "8ffeff3188782b6d5968551d3ef9d0c3de4245320b699b29eda0bd3bb5a0005120a476b423c65767c4756d1b2c89616a61809bfdf459bb3b50e4edd7936ca7cf"

RPROVIDES:${PN} += "libzbarqt-devel \
pkgconfig-zbar-qt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzbar-devel \
libzbarqt0 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-zbar"

inherit rpm
