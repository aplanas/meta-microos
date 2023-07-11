SUMMARY = "SDR driver for FL2000 based USB to VGA adapters"
DESCRIPTION = "Osmo-fl2k allows to use USB 3.0 to VGA adapters based on the \
Fresco Logic FL2000 chip as general purpose DACs and SDR transmitter \
generating a continuous stream of samples by avoiding the HSYNC and \
VSYNC blanking intervals."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1+git.20200602"

RPM_NAME = "libosmo-fl2k0-0.1.1+git.20200602-1.12.aarch64.rpm"
RPM_HASH = "e60e750e603b80632bcc850d063a27373169b651424dc6b7b164be2e0b1113101bc2b6e07dbc29011d447adc91df834f0af740ce4b364d4d6cb2650f335c609b"

RPROVIDES:${PN} += "libosmo-fl2k.so.0 \
libosmo-fl2k0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
osmo-fl2k-udev"

inherit rpm
