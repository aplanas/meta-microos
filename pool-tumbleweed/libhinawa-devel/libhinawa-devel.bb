SUMMARY = "Header files for libhinawa, a lib for IEEE 1394 async transactions"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require libhinawa."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libhinawa-devel-2.4.0-1.6.aarch64.rpm"
RPM_HASH = "8857d254a5f8764d592a3fd11c01307ff73282ee82900466843124b7644c0727841303b83e07fd2d4ff33ecc8846bed73e1413b5717c17553b7eeef0c7a1b0d5"

RPROVIDES:${PN} += "libhinawa-devel \
libhinawa-devel(aarch-64) \
pkgconfig(hinawa)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhinawa2 \
pkgconfig(gobject-2.0)"

inherit rpm
