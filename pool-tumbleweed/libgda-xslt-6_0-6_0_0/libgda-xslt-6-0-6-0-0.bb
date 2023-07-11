SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-xslt-6_0-6_0_0-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "d2bde632e9f0857f78178ff4eafd9a6a5a2dcd34c5ebca6e0c0527bb42158d3f080a9ce46c495456adf2b5d5b28a68b08d64ce4822f66ff936c228b63cd81a8b"

RPROVIDES:${PN} += "libgda-xslt-6-0-6-0-0 \
libgda-xslt-6.0.so.6.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6.0.so.6.0.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.2 \
libxslt.so.1"

inherit rpm
