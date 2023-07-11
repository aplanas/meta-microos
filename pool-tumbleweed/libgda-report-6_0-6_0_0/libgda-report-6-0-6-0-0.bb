SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-report-6_0-6_0_0-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "34e842c20030c513d23c2fd657dbddffa75cfa6d4fc6e1a88a2da55680c74b15ea1540097d47a306c1fc03950307cf94c546521fc83602a265c2230e8ad3cfdd"

RPROVIDES:${PN} += "libgda-report-6-0-6-0-0 \
libgda-report-6.0.so.6.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6.0.so.6.0.0 \
libgda-report \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.2"

inherit rpm
