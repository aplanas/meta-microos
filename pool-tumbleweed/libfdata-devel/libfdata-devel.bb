SUMMARY = "Development files for libfdata"
DESCRIPTION = "Library to provide generic file data functions for the libyal family of libraries. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfdata."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libfdata-devel-20230319-1.1.aarch64.rpm"
RPM_HASH = "ec82ad38044b802be07b59a73c34fd6f82b510d760100288cd5a9152e553477ed835223bd4904fdc8cb26aace4fb6206a06c029a8028d083c719fbccef92f794"

RPROVIDES:${PN} += "libfdata-devel \
pkgconfig-libfdata"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdata1"

inherit rpm
