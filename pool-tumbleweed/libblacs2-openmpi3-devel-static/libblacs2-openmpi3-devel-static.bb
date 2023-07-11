SUMMARY = "Development libraries for BLACS (openmpi3)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi3-devel-static-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "5e7a0d1e4e8c2eaa17753f1dfc357e363bbf1d436b72e3bd7f1abb3b47025c09f72ba1648028fec8f41953da671def671e538b39b87bfe370ae47d21468be08f"

RPROVIDES:${PN} += "libblacs2-openmpi3-devel-static"

RDEPENDS:${PN} += "libblacs2-openmpi3-devel"

inherit rpm
