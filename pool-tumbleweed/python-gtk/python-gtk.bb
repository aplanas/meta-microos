SUMMARY = "Python bindings for the GTK+ widget set"
DESCRIPTION = "PyGTK is an extension module for python that gives you access to the \
GTK+ widget set.  Just about anything you can write in C with GTK+ you \
can write in python with PyGTK (within reason), but with all of \
python's benefits."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.0"

RPM_NAME = "python-gtk-2.24.0-22.9.aarch64.rpm"
RPM_HASH = "2fb4a64aa445567b0501a849275c8942dbea41f62a90388d38e3e7e6635c2b06b1758750398c194d2bc0871a853fb1296bf62a3bb398f217428f1ee1b880a2e1"

RPROVIDES:${PN} += "pygtk2 \
python-gtk \
python2-gtk"

RDEPENDS:${PN} += "atk \
glib2 \
gtk2 \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglade-2.0.so.0 \
libglade2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
pango \
python-abi \
python-cairo \
python-gobject2"

inherit rpm
