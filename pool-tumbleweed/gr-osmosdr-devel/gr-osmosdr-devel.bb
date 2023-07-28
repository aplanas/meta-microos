SUMMARY = "Development files for gr-osmosdr"
DESCRIPTION = "Library headers for gr-osmosdr. \
OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "gr-osmosdr-devel-0.2.4-1.3.aarch64.rpm"
RPM_HASH = "7e4a521ed90e2e31f366633f0f628c5bfa06f89eb3a268f2816bd1486857088f0b031743ce564bdba64e7756bc0bffc0d0f5b2262416f89864b365375320028d"

RPROVIDES:${PN} += "cmake-gnuradio-osmosdr \
gr-osmosdr-devel"

RDEPENDS:${PN} += "gr-osmosdr \
libgnuradio-osmosdr0-2-0"

inherit rpm
