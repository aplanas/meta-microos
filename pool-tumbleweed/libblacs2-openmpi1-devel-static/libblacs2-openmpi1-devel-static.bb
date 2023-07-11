SUMMARY = "Development libraries for BLACS (openmpi1)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi1-devel-static-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "6fd7ed944d01554cdcc743f4fc5b3f889c7c9f0c7642607b3b0f9a00aad13db21a7f3fe5783e7be120d780ba3bf2a2c40d8e9f674905479c01b459eab322cc76"

RPROVIDES:${PN} += "libblacs2-openmpi-devel \
libblacs2-openmpi1-devel-static"

RDEPENDS:${PN} += "libblacs2-openmpi1-devel"

inherit rpm
