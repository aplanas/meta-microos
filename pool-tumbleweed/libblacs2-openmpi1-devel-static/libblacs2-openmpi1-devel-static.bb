SUMMARY = "Development libraries for BLACS (openmpi1)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi1-devel-static-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "371d27501f5071cb94251953820db44f0ab3ac3de8285d5731e51ba9473cfef67d47a2b1d5c5ac6fd59006b2673f66ded0439c29939fafaaf58d30a85958f8e4"

RPROVIDES:${PN} += "libblacs2-openmpi-devel \
libblacs2-openmpi1-devel-static"

RDEPENDS:${PN} += "libblacs2-openmpi1-devel"

inherit rpm
