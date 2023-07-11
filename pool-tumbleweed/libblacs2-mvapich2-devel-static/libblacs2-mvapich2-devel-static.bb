SUMMARY = "Development libraries for BLACS (mvapich2)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-mvapich2-devel-static-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "87bce60468e568295cb73d27edb5097e64b69297ad2eadd78c7a4eb3d47ab8013d47e186d6121ad574235f2bd0fcc01f44fc941c5b8977f11e5c5d7d36f65c0f"

RPROVIDES:${PN} += "libblacs2-mvapich2-devel-static"

RDEPENDS:${PN} += "libblacs2-mvapich2-devel"

inherit rpm
