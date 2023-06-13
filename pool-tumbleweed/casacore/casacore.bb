SUMMARY = "A suite of C++ libraries for radio astronomy data processing"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "casacore-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "ea96a071a25c6dd916c350e447e617b9434fc2db5b5a8116e7701612e8866bff10c57696abe22146d83286e4b79d344820fc71479862cbce9f05be5cb5730530"

RPROVIDES:${PN} += "casacore \
casacore(aarch-64)"

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
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
