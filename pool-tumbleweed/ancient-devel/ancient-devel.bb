SUMMARY = "Development files for libancient"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libancient."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "ancient-devel-2.0.0-1.4.aarch64.rpm"
RPM_HASH = "fcaebb82f8edbddd582088c0a8916ea1f3cb1abbbc81388f2d300661690cfe61f0a2cb37291aec3dc21b50ae014c6d3bdb2a35f81640862ce5e7d6dae477deec"

RPROVIDES:${PN} += "ancient-devel \
pkgconfig-libancient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libancient2"

inherit rpm
