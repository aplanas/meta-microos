SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-openmpi3-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "06fefe83fce06c2e4a5642900a4ed22beb827f1254cf3718bdfdf52194f60d5a42fda143ca94bcb915c5d798af9d5a2f7b68162356b0bf2b830d69e295b6067a"

RPROVIDES:${PN} += "casacore-openmpi3 \
casacore-openmpi3(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcasa_casa.so.7()(64bit) \
libcasa_coordinates.so.7()(64bit) \
libcasa_fits.so.7()(64bit) \
libcasa_images.so.7()(64bit) \
libcasa_lattices.so.7()(64bit) \
libcasa_measures.so.7()(64bit) \
libcasa_ms.so.7()(64bit) \
libcasa_msfits.so.7()(64bit) \
libcasa_scimath.so.7()(64bit) \
libcasa_tables.so.7()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libmpi.so.40()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
