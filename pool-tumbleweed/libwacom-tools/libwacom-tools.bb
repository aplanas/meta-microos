SUMMARY = "Library to identify wacom tablets -- Tools"
DESCRIPTION = "libwacom is a library to identify wacom tablets and their model-specific \
features. It provides easy access to information such as 'is this a \
built-in on-screen tablet', 'what is the size of this model', etc."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libwacom-tools-2.5.0-1.3.aarch64.rpm"
RPM_HASH = "6c208c9a0d9c9a9bcc37429343000a44b01351706c2695828070892efc8bf34826eb3afb42debe2cc694fd445733a69ae6fafe679c8e2aa5c90548a425268304"

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
