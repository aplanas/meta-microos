SUMMARY = "GNU Data Access (GDA) Library - Plugins for UI Widgets"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-ui-6_0-plugins-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "0bd4f1ece1f8e74405f72f7a0de7b12ec442345b13f066a1f5431fc9bb5d89718dc9ba24c5f9998d04560faec6d72528ffb2a3fa88ca9e4739e59b151a44ef59"

RPROVIDES:${PN} += "libgda-ui-6-0-plugins \
libgda-ui-plugins-libgda-6.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgda-6.0.so.6.0.0 \
libgda-ui-6.0.so.6.0.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
