SUMMARY = "Deepin Turbo libraries"
DESCRIPTION = "The package provides libraries for deepin-turbo."
LICENSE = "LGPL-2.1+"

PV = "0.0.5"

RPM_NAME = "libdeepin-turbo0-0.0.5-2.10.aarch64.rpm"
RPM_HASH = "ad5396ddb09047af59cac001fb2487dc07b07e9e6b2775efd87248f8954f95d3afdd5d90d9cecca490486e9ae6f34a26bea941192dd13a205eae6ca124415c1b"

RPROVIDES:${PN} += "libdeepin-turbo.so.0 \
libdeepin-turbo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
