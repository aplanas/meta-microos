SUMMARY = "Cloner for host assisted cloning"
DESCRIPTION = "Source and Target cloner image for host assisted cloning"
LICENSE = "Apache-2.0"

PV = "1.56.0"

RPM_NAME = "containerized-data-importer-cloner-1.56.0-1.3.aarch64.rpm"
RPM_HASH = "732b7bed13ca6c21661ccc553b745638be39d2c7d09699b6aca39e27863ac45186eaa6075d75ba37ed66fa3d356f3dc8119234989771ca6aabb4b439ed8f491e"

RPROVIDES:${PN} += "containerized-data-importer-cloner containerized-data-importer-cloner(aarch-64)"
RDEPENDS:${PN} += "/bin/bash libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
