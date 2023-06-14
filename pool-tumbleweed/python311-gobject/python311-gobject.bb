SUMMARY = "Python bindings for GObject"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python311-gobject-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "e27267dd041d9738d7e714803e219f4ae4c0f7e718cf34c19dded2c54fb7a601dafbe5a8945522a96bffbc3c701489d3eaf6849be3e47f6b6098c74141931b40"

RPROVIDES:${PN} += "python3.11dist-pygobject \
python311-gobject \
python3dist-pygobject"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
python-abi \
typelib-GLib \
typelib-Gio"

inherit rpm
