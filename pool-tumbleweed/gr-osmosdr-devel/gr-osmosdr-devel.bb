SUMMARY = "Development files for gr-osmosdr"
DESCRIPTION = "Library headers for gr-osmosdr. \
OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "gr-osmosdr-devel-0.2.4-1.1.aarch64.rpm"
RPM_HASH = "d00d8b88caab00b31e8692593b0e06c40d2de552c40450f91d4eed1755ff5f8bbae9c0dd1bfc9aa53605a1421dfb89cb904e84bf802113e7b9bc2ca08be0ba55"

RPROVIDES:${PN} += "cmake(gnuradio-osmosdr) \
gr-osmosdr-devel \
gr-osmosdr-devel(aarch-64)"

RDEPENDS:${PN} += "gr-osmosdr \
libgnuradio-osmosdr0_2_0"

inherit rpm
