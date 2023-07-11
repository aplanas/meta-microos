SUMMARY = "YaST2 - SLP Agent and Library"
DESCRIPTION = "This package provides YaST modules to lookup/advertise services with SLP."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-slp-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "4c1e655eaa7d28e977a56e1873327150eea4d5b7563bb41033691aae2f35de07515becd25d38427d48ffe1efe30ca49df5e0b81bdb374d6a1a6a798b01351c50"

RPROVIDES:${PN} += "libpy2ag-slp.so.2 \
yast2-slp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libscr.so.3 \
libslp.so.1 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
openslp \
yast2 \
yast2-ruby-bindings"

inherit rpm
