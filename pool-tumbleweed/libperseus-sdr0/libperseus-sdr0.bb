SUMMARY = "Library for Perseus SDR"
DESCRIPTION = "Perseus Software Defined Radio Control Library."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "libperseus-sdr0-0.8.1-1.23.aarch64.rpm"
RPM_HASH = "ef16366662285d901432fa9d7a0938db5b729a49070cc2d781fa45d1ea0d5c77525266d0cae349ac227e05c6fe524eea1b86946deeb84eb57f14c0c6e20eecd3"

RPROVIDES:${PN} += "libperseus-sdr.so.0 \
libperseus-sdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libperseus-sdr-udev \
libusb-1.0.so.0"

inherit rpm
