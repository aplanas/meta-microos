SUMMARY = "Input device and event processing library integration into udev"
DESCRIPTION = "The libinput udev helper rule will set the LIBINPUT_DEVICE_GROUP \
variable for event devices. Device groups are a labelling system to \
allow callers to identify which libinput devices are part of the same \
physical device."
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "libinput-udev-1.23.0-1.1.aarch64.rpm"
RPM_HASH = "f5bf42f98a89915ad34e04347cc5df6dc821371108182b3451788778b7beb1cfe35764dc97406dba337b65dcd90c82b72c0f9e7e1251ab7853ccaa93a62dd34b"

RPROVIDES:${PN} += "libinput-udev"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libudev.so.1 \
libwacom.so.9"

inherit rpm
