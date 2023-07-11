SUMMARY = "Static libraries for ScaLAPACK (openmpi4)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi4-devel-static-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "8caddc598691aea385752da5981a5e263475ad50800a39643d213d47a05cf0f3d90238c77e8e054eec1bc8d9750c96e9f0279955b961f72723af827caadff4ea"

RPROVIDES:${PN} += "libscalapack2-openmpi4-devel-static \
scalapack-openmpi4-devel-static"

RDEPENDS:${PN} += "libscalapack2-openmpi4-devel"

inherit rpm
