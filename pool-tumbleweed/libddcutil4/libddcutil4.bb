SUMMARY = "Shared library to query and update monitor settings"
DESCRIPTION = "Shared library version of ddcutil, exposing a C API. \
 \
ddcutil communicates with monitors implementing MCCS (Monitor Control Command \
Set), using either the DDC/CI protocol on the I2C bus or as a Human Interface \
Device on USB."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libddcutil4-1.4.1-2.2.aarch64.rpm"
RPM_HASH = "6baf4476420fd967e8d0630ab6598639ff70f6845791ad9beb8aae30986db1f3a6c14552937d1350ed157d13d1466e42ee4b7644f50af8bb67f5cac2f651f6b7"

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
