SUMMARY = "Gnuradio Source for OsmoSDR"
DESCRIPTION = "OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "gr-osmosdr-0.2.4-1.2.aarch64.rpm"
RPM_HASH = "e3cecc47c6dc03e3074ce13a6017663b13d7b2b0504a01285ef5db37a6590ee97cb4b800a819c905486d71957276dd3e64524d0f1a32765d3e293ea2ebb6f0a2"

RPROVIDES:${PN} += "gr-osmosdr"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gr-osmosdr"

inherit rpm
