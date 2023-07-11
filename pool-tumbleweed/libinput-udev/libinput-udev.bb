SUMMARY = "Input device and event processing library integration into udev"
DESCRIPTION = "The libinput udev helper rule will set the LIBINPUT_DEVICE_GROUP \
variable for event devices. Device groups are a labelling system to \
allow callers to identify which libinput devices are part of the same \
physical device."
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "libinput-udev-1.23.0-1.2.aarch64.rpm"
RPM_HASH = "ad98bff3d8795da70e7c005323cb1fbe00709b5c4d75ba510fe0d7686c5e01ff8ff78bd8ae316ea61a4238424478b0275b4c6e22328696e11079c0dedfc5fb60"

RPROVIDES:${PN} += "libinput-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libudev.so.1 \
libwacom.so.9"

inherit rpm
