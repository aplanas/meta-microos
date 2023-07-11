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

RPM_NAME = "libgda-ui-6_0-tools-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "a4511c6d3a46a2e625db071d92bac13f679ee1f346de90148a02b8f7dd448e11ac306638ec5c03cd025d0583177c090c9b8d8ed57dc6521569d57d031265a830"

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
