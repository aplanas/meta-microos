SUMMARY = "GNU Data Access (GDA) Library -- Developer Documentation"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-doc-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "4b7f88f7c02576a97d177d511d8e29479a4b1910f5f98c156561b95ba75d37f5c4b639b3a5c72fc17a0cf468d22b2c5ea53a7450150fb14a04a70f27e29df0bd"

RPROVIDES:${PN} += "libgda-6-0-doc \
libgda-doc"

RDEPENDS:${PN} += ""

inherit rpm
