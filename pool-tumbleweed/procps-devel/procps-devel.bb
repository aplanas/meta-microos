SUMMARY = "Development files for procps"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system. \
 \
This subpackage contains the header files for libprocps."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.3.17"

RPM_NAME = "procps-devel-3.3.17-12.4.aarch64.rpm"
RPM_HASH = "df0490a01da88a51594c02bb35ff22aa4b2b4cf216a21cca2c2d6e3f16e0e7003b1b1c32b02acbb88f902adaef8a42b82ee081fda05d779d2d9b5f50df21549e"

RPROVIDES:${PN} += "pkgconfig-libprocps \
procps-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprocps8"

inherit rpm
