SUMMARY = "Shared library for Budgie raven plugins"
DESCRIPTION = "Shared library for budgie raven plugins to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.2+0"

RPM_NAME = "libbudgie-raven-plugin0-10.7.2+0-1.1.aarch64.rpm"
RPM_HASH = "018cd97c1b86c365b4ae76dc78bdbfa2366b8fef12eb0b90a691997978c7b7db3afbf3d3b7d0b5476e10000261edb0efde1a3f11c4a0d4650b1ccab47c06fe84"

RPROVIDES:${PN} += "libbudgie-raven-plugin.so.0()(64bit) \
libbudgie-raven-plugin0 \
libbudgie-raven-plugin0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
