SUMMARY = "Osmocom E1 Daemon"
DESCRIPTION = "osmo-e1d is an E1 interface daemon that is part of the Osmocom E1 \
interface driver architecture. It was primarily written for the \
ICE40_E1_USB_interface (ICE40 based E1 framer IP core developed by \
tnt). \
 \
osmo-e1d acts as an interface between the hardware/firmware of the E1 \
interface on the bottom side, and applications wanting to use E1 \
timeslots on the top side."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "osmo-e1d-0.5.0-1.1.aarch64.rpm"
RPM_HASH = "3d59f0a8977bd4cd1d57f8f339517c89c808f9d2be49ee98a77306714ddc8b9298a1b51c814f2cb79aa6ddadcf1361811b470be977591d47da6114e6117bf519"

RPROVIDES:${PN} += "osmo-e1d \
osmo-e1d(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libosmo-e1d.so.1()(64bit) \
libosmo-octoi.so.1()(64bit) \
libosmocore.so.20()(64bit) \
libosmousb.so.0()(64bit) \
libosmovty.so.9()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
