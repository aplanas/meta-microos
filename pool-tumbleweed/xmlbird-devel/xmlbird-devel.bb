SUMMARY = "Development files for xmlbird"
DESCRIPTION = "XML parser with support for Vala iterators. \
 \
This package contains the pkgconfig, header files and libraries needed to \
develop application that use xmlbird."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.12"

RPM_NAME = "xmlbird-devel-1.2.12-1.4.aarch64.rpm"
RPM_HASH = "d46f2106abf7e06a6ef0b5e23e25b99cd2165bc7b8ffdf8bd8ad63b62afaf2b25d892288f39bab0979d0efe599cade52d07d59c933962b94dab658b7284cde7c"

RPROVIDES:${PN} += "pkgconfig-xmlbird \
xmlbird-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxmlbird1 \
pkgconfig-glib-2.0"

inherit rpm
