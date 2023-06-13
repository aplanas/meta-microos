SUMMARY = "GNU Data Access (GDA) Library -- Tools"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides command-line tools for libgda."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-tools-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "c11d2d15138b176fce1e38408b5ef2a4e325e699774cc3ff87a3a8c70f55523bd56467e7856e2dc74a46111a0fb6c9721d1175541ba6d8bc7629fe8173f91f0d"

RPROVIDES:${PN} += "libgda-6_0 \
libgda-6_0-tools \
libgda-6_0-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgda-6.0.so.6.0.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsoup-2.4.so.1()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
