SUMMARY = "Development libraries for BLACS (openmpi3)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi3-devel-static-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "34c52dcbefa3f43409d6c90d3cda0aff5e6cdb0c05bda5ef93e0b992d4f9643796c7e4f8404f6879a30ea05fc8ddfd0503165cac939424bf0bf360683f910690"

RPROVIDES:${PN} += "libblacs2-openmpi3-devel-static"

RDEPENDS:${PN} += "libblacs2-openmpi3-devel"

inherit rpm
