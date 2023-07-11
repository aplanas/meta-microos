SUMMARY = "GNU Data Access (GDA) Library -- Tools"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data. \
 \
This package provides command-line tools for libgda."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-tools-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "e0759b3358f23e8f0dd8ee4593c51fb99ab00b94f38e1a0af17f564d41a4bc9688e28e4c4e04ec34ba23b3a992541186e7549b9428bf07996e1dd65c03be6d3c"

RPROVIDES:${PN} += "libgda-6-0 \
libgda-6-0-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsoup-2.4.so.1 \
libxml2.so.2"

inherit rpm
