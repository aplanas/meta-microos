SUMMARY = "YaST2 - YCP Bindings for the YaST2 User Interface Engine"
DESCRIPTION = "This package makes the generic YaST2 user interface engine available \
for YCP applications (YCP is the scripting language in which most YaST2 \
modules are written)."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-ycp-ui-bindings-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "6692fea61e1266d6ce52334614d0699bb08c7f4088412390bf0fb37fbd1d25dca90c1e17f9ddc1b97cada63101a129d3e3765ce07afc2118edc96898911b8359"

RPROVIDES:${PN} += "libpy2UI.so.2 \
yast2-ycp-ui-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
libycpvalues.so.6 \
libyui.so.16 \
libyui16 \
yast2-core"

inherit rpm
