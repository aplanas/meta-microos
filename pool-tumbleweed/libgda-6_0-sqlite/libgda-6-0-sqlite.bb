SUMMARY = "Sqlite Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-sqlite-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "5e4c5cb8920fcff450c276f353b625953868af10e3a0dc89920b2faf922b462d2a8112b479b01756944f0de2d797b4be3c25d73e9823117bdf33bc75f282013e"

RPROVIDES:${PN} += "libgda-6-0-sqlite \
libgda-sqlite \
libgda-sqlite-6.0.so"

RDEPENDS:${PN} += "libgda-6-0-6-0-0 \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
