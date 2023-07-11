SUMMARY = "MySQL Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-mysql-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "bbd3337a4b679dc627bc7f812d81d08ff6b53226e94891cd9754eac616aa9b77b86beaf7fa5ddc04aa2287c5b6a1974955f6c789bec47e07fee849e5ee0a9081"

RPROVIDES:${PN} += "libgda-6-0-mysql \
libgda-mysql \
libgda-mysql-6.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6-0-6-0-0 \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmariadb.so.3"

inherit rpm
