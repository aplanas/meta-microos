SUMMARY = "Utility to query and update monitor settings"
DESCRIPTION = "ddcutil communicates with monitors implementing MCCS (Monitor Control Command \
Set), using either the DDC/CI protocol on the I2C bus or as a Human Interface \
Device on USB. \
 \
A particular use case for ddcutil is as part of color profile management. \
Monitor calibration is relative to the monitor color settings currently in \
effect, e.g. red gain.  ddcutil allows color related settings to be saved at \
the time a monitor is calibrated, and then restored when the calibration is \
applied."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "ddcutil-1.4.1-2.1.aarch64.rpm"
RPM_HASH = "a91ae5dfb7640326abdbdcdb31e39f55a2d74de47045812d21b6d6b56c81826ac5f74a6db985666623055d2222b546ffeb24a1e0a54f358f409e10c116e53b19"

RPROVIDES:${PN} += "ddcutil \
ddcutil(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libkmod.so.2()(64bit) \
libkmod.so.2(LIBKMOD_5)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
