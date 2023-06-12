SUMMARY = "GNU Data Access (GDA) Library - Plugins for UI Widgets"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-ui-6_0-plugins-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "9ecfedafa8f779a31c6e061e29f4bb377c17b547bf8a76f4e95f4758b207461a478b387c9786507c450387ab1e219a0dc14c92901ff223bb79985d16c1392c16"

RPROVIDES:${PN} += "libgda-ui-6_0-plugins \
libgda-ui-6_0-plugins(aarch-64) \
libgda-ui-plugins-libgda-6.0.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgda-6.0.so.6.0.0()(64bit) \
libgda-ui-6.0.so.6.0.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
