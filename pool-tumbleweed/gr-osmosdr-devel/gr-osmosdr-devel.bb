SUMMARY = "Development files for gr-osmosdr"
DESCRIPTION = "Library headers for gr-osmosdr. \
OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "gr-osmosdr-devel-0.2.4-1.2.aarch64.rpm"
RPM_HASH = "abd8cb2628b841910ba289014abc1a2baf053e4eefd9a2856586f0a1897f9de45a071bc4714afc0e284d177df8204d172fdcf14741b2afe19e511ea9df01f95a"

RPROVIDES:${PN} += "cmake-gnuradio-osmosdr \
gr-osmosdr-devel"

RDEPENDS:${PN} += "gr-osmosdr \
libgnuradio-osmosdr0-2-0"

inherit rpm
