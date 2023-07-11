SUMMARY = "Python Bindings for the Thunar Extension Framework"
DESCRIPTION = "This package provides the Python bindings for the Thunar Extension framework \
which allow one to create Python plugins for Thunar."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "thunarx-python-0.5.2-1.13.aarch64.rpm"
RPM_HASH = "45ce27e34a6265c35050debc896bde8daceb5c2de6934b194f7a9c4bc42f37393ca0eaeda6e02ea31093a069ee07cfb15e1d44068deddd316f72f596196ae5e6"

RPROVIDES:${PN} += "thunarx-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpython3.11.so.1.0 \
libthunarx-3.so.0 \
thunar"

inherit rpm
