SUMMARY = "GNU Data Access (GDA) Library"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-xslt-6_0-6_0_0-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "7b933e256fb9448a98b0e66fd5b617cd5ab0946d1585e9e83e2036d0a412d53b00ddcf9143ac23497cbf1137c4e8efc8050364b18c12b87809134aad9cb7e224"

RPROVIDES:${PN} += "libgda-xslt-6.0.so.6.0.0()(64bit) \
libgda-xslt-6_0-6_0_0 \
libgda-xslt-6_0-6_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgda-6.0.so.6.0.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit)"

inherit rpm
