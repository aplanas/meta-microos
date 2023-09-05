SUMMARY = "Input device and event processing library integration into udev"
DESCRIPTION = "The libinput udev helper rule will set the LIBINPUT_DEVICE_GROUP \
variable for event devices. Device groups are a labelling system to \
allow callers to identify which libinput devices are part of the same \
physical device."
LICENSE = "MIT"

PV = "1.24.0"

RPM_NAME = "libinput-udev-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "8afa9760b2953b32c2ec6320650cf880cc90a31bd32d19cc9fc0c1eaebe5b5abda85dc31054ea7df1c365ae7394a1daaaff98a9868bf4e1d81ac712bbd8c37c5"

RPROVIDES:${PN} += "libinput-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libudev.so.1 \
libwacom.so.9"

inherit rpm
