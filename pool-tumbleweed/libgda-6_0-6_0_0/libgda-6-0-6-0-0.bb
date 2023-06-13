SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-6_0_0-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "daf6147ce7103fbdd078927bb9583f38ffec21f6c293b5a533d00076c602e5e4e4bc0e35987f23d920a3705c932cb6c8c2fb20977017df46af4dbade1436ffc2"

RPROVIDES:${PN} += "libgda-6.0.so.6.0.0()(64bit) \
libgda-6_0-6_0_0 \
libgda-6_0-6_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
