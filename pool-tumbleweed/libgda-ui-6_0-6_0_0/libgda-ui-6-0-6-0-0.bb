SUMMARY = "GNU Data Access (GDA) Library - UI Widgets"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-ui-6_0-6_0_0-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "d810b2318e40113edc570970f00d260b5f3564ef71dc62bb4536d0f44750613627db3db7ec88fe09f42b0e8b592c9fba450440bc095a13c28edc7dfbdd09431d"

RPROVIDES:${PN} += "libgda-ui-6-0-6-0-0 \
libgda-ui-6.0.so.6.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgda-6.0.so.6.0.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libxml2.so.2"

inherit rpm
