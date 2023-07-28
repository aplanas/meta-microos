SUMMARY = "Development files for libancient"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libancient."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "ancient-devel-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "244d9e4d305d83e60c46bcfa164ae0eee9201de301be64e574c22d3a68065420981b3f1c0390182dcc0ffa7cae11cdf899f7ab502f0051af927145cca9af137c"

RPROVIDES:${PN} += "ancient-devel \
pkgconfig-libancient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libancient2"

inherit rpm
