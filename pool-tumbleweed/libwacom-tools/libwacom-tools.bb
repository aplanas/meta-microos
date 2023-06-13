SUMMARY = "Library to identify wacom tablets -- Tools"
DESCRIPTION = "libwacom is a library to identify wacom tablets and their model-specific \
features. It provides easy access to information such as 'is this a \
built-in on-screen tablet', 'what is the size of this model', etc."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libwacom-tools-2.5.0-1.3.aarch64.rpm"
RPM_HASH = "6c208c9a0d9c9a9bcc37429343000a44b01351706c2695828070892efc8bf34826eb3afb42debe2cc694fd445733a69ae6fafe679c8e2aa5c90548a425268304"

RPROVIDES:${PN} += "libwacom-tools \
libwacom-tools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libwacom.so.9()(64bit) \
python3-libevdev \
python3-pyudev"

inherit rpm
