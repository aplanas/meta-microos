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

RPM_NAME = "osmo-e1d-0.5.0-1.2.aarch64.rpm"
RPM_HASH = "370718453bd84a496cd58cdc9926baa4a4ef669e60838fb9106b69ff4c178a12fa9cb1043679809b828e83165826231ce39c8319fbde0f1e7ce16ad9d6bfa210"

RPROVIDES:${PN} += "osmo-e1d"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-e1d.so.1 \
libosmo-octoi.so.1 \
libosmocore.so.20 \
libosmousb.so.0 \
libosmovty.so.9 \
libtalloc.so.2 \
libusb-1.0.so.0"

inherit rpm
