SUMMARY = "Documentation for libbladeRF"
DESCRIPTION = "HTML documentation files for libbladeRF."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2.5.0"

RPM_NAME = "libbladeRF2-doc-2.5.0-16.3.aarch64.rpm"
RPM_HASH = "59326555e79fc2a39708d3f2c6d6d4614cf35fe19d3bebf9cff9ab2309e21107c9b100fb3699610e67392446d510c72cac0944ad24fe69948ec1b5dcd8534e54"

RPROVIDES:${PN} += "libbladeRF2-doc \
libbladeRF2-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
