SUMMARY = "Library to identify wacom tablets -- Tools"
DESCRIPTION = "libwacom is a library to identify wacom tablets and their model-specific \
features. It provides easy access to information such as 'is this a \
built-in on-screen tablet', 'what is the size of this model', etc."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libwacom-tools-2.5.0-1.4.aarch64.rpm"
RPM_HASH = "4d8d1663e126af0238c8b51e050354d9cda21c4f039d669f270f5a8af6424a85dbe6034fae1c5c8ae39857794fd35a34074630babd5e0557bc122d8b55b67c44"

RPROVIDES:${PN} += "libwacom-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libwacom.so.9 \
python3-libevdev \
python3-pyudev"

inherit rpm
