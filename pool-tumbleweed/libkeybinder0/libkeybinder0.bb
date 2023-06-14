SUMMARY = "A library for registering global keyboard shortcuts"
DESCRIPTION = "Library for registering global keyboard shortcuts. Keybinder \
works with GTK-based applications using the X Window System. \
 \
The library contains: \
- A C library, libkeybinder \
- Lua bindings, lua-keybinder \
- Python bindings, python-keybinder \
- An examples directory with programs in C, Lua, Python and Vala."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "0.3.1"

RPM_NAME = "libkeybinder0-0.3.1-3.6.aarch64.rpm"
RPM_HASH = "b6282ebb631882a11463dfb70aa5bf4a7b0a52a686f5572b19c4d522d54444dec579f875fd8fbe3ae69e6c065afd800cd22b32cca8c345f86536be41e9e996e9"

RPROVIDES:${PN} += "libkeybinder.so.0 \
libkeybinder0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
