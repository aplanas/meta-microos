SUMMARY = "3D printer control software"
DESCRIPTION = "Communication library between internal components for Ultimaker software"
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libArcus3-4.13.1-3.12.aarch64.rpm"
RPM_HASH = "3c96133144b45671d432ed22fbfd5263fcb6e9e9bc5c9d40daf5b451003d668c316d9c47e41ed54cec91b87a18a8e91ebdcfbbdbeb96ca489aeed08c98487f55"

RPROVIDES:${PN} += "libArcus-Ultimaker \
libArcus.so.3 \
libArcus3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
