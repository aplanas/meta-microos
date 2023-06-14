SUMMARY = "GNU Data Access (GDA) Library -- Graphical Tools"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides graphical tools: \
  - gda-browser: a tool to browse databases \
  - gda-control-center: configuration tool for libgda"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-ui-6_0-tools-6.0.0-6.7.aarch64.rpm"
RPM_HASH = "8a97a5bb27bf35976fe61ed916ed94a40666f1e47c0a6ad373b50f08a90fa32a0f06393b75a560b897adee985319ddd62fc3f506cf25544564d3bdc0ffc164ed"

RPROVIDES:${PN} += "libgda-ui-6-0-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgda-6.0.so.6.0.0 \
libgda-ldap-6.0.so \
libgda-ui-6.0.so.6.0.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgoocanvas-2.0.so.9 \
libgtk-3.so.0 \
libsoup-2.4.so.1 \
libxml2.so.2"

inherit rpm
