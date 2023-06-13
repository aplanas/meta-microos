SUMMARY = "Python bindings for GObject/Cairo"
DESCRIPTION = "Pygobjects is an extension module for python that gives you access to \
GLib's GObjects. \
 \
This package contains the Python Cairo bindings for GObject."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.1"

RPM_NAME = "python310-gobject-cairo-3.44.1-1.2.aarch64.rpm"
RPM_HASH = "b267b0107010317e373ee81f77b495cdf0e666800e0330138335033a5167d514984bf9750724ad42c8bd899adfbbb6ebd2b41041f6c1367c5eac027402686bec"

RPROVIDES:${PN} += "python3-gobject-cairo \
python310-gobject-cairo \
python310-gobject-cairo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libgobject-2.0.so.0()(64bit) \
python(abi) \
python310-cairo \
python310-gobject"

inherit rpm
