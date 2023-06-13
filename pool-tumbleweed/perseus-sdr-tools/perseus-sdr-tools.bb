SUMMARY = "Tools for Perseus SDR"
DESCRIPTION = "Tools for Perseus SDR devices."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "perseus-sdr-tools-0.8.1-1.22.aarch64.rpm"
RPM_HASH = "24b773b5b7e533644034e82e764156f7393b8556aa93b0dd3807214f6dcaec1ad7d247725d2ef253a524b462d03845dd1ecb8615eeec9140719a4f2a8dafd8c5"

RPROVIDES:${PN} += "perseus-sdr-tools \
perseus-sdr-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libperseus-sdr.so.0()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
