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

RPM_NAME = "ddcutil-1.4.1-2.2.aarch64.rpm"
RPM_HASH = "29d36d0b4477288193912988d0f19a8c70cf122de496def737a343454a97045aed8db343f5ae388d9eca4dc47e5eb83b3514350c7131ee8ef77b7a72ff189a1c"

RPROVIDES:${PN} += "ddcutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXrandr.so.2 \
libc.so.6 \
libdrm.so.2 \
libglib-2.0.so.0 \
libkmod.so.2 \
libudev.so.1"

inherit rpm
