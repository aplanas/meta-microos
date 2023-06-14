SUMMARY = "Shared library to query and update monitor settings"
DESCRIPTION = "Shared library version of ddcutil, exposing a C API. \
 \
ddcutil communicates with monitors implementing MCCS (Monitor Control Command \
Set), using either the DDC/CI protocol on the I2C bus or as a Human Interface \
Device on USB."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libddcutil4-1.4.1-2.1.aarch64.rpm"
RPM_HASH = "7fe1de40d3ae404668e40cd06e23af0071464d6241b3d04845cc525338e4415d5b5333b8154cd70cae6324541a17e6d9268f2a482fd169bb19d283fa1eb172ce"

RPROVIDES:${PN} += "libddcutil.so.4 \
libddcutil4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libudev.so.1 \
libusb-1.0.so.0"

inherit rpm
