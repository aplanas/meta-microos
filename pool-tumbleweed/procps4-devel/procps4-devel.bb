SUMMARY = "Development files for procps"
DESCRIPTION = "The procps library can be used to read informations out from /proc \
the process information pseudo-file system. \
 \
This subpackage contains the header files for libprocps."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.0.3"

RPM_NAME = "procps4-devel-4.0.3-3.1.aarch64.rpm"
RPM_HASH = "74e80e1aa23a8565b9267697d3024d97893507cda37ca51dfc4c71aa63d92ef5fc2e0ce9d2f525194f66abf2ecab10264f1679bc0a5fbd9dd7b8df05af2c266e"

RPROVIDES:${PN} += "pkgconfig-libproc2 \
procps4-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libproc2-0"

inherit rpm
