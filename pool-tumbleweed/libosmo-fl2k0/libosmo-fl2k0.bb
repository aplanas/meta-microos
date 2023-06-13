SUMMARY = "SDR driver for FL2000 based USB to VGA adapters"
DESCRIPTION = "Osmo-fl2k allows to use USB 3.0 to VGA adapters based on the \
Fresco Logic FL2000 chip as general purpose DACs and SDR transmitter \
generating a continuous stream of samples by avoiding the HSYNC and \
VSYNC blanking intervals."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.1+git.20200602"

RPM_NAME = "libosmo-fl2k0-0.1.1+git.20200602-1.11.aarch64.rpm"
RPM_HASH = "c894d6874bba8c1fcfea66df611f188f01dbbeda995b085803d2d5f170cdd677dee87c580f607fd13a4d8315f8051b8f1e466ca1b49f49614ef141210c5cd25d"

RPROVIDES:${PN} += "libosmo-fl2k.so.0()(64bit) \
libosmo-fl2k0 \
libosmo-fl2k0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libusb-1.0.so.0()(64bit) \
osmo-fl2k-udev"

inherit rpm
