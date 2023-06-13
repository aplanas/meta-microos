SUMMARY = "YaST2 - YCP Bindings for the YaST2 User Interface Engine"
DESCRIPTION = "This package makes the generic YaST2 user interface engine available \
for YCP applications (YCP is the scripting language in which most YaST2 \
modules are written)."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-ycp-ui-bindings-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "d331ff172a327d50e6f1cbdca8250a2c2cd5d0c3696bc404b2ad98d408bb2f036a859f2d5c3e448f756586e3aa7a8c1cace932c12b042c5c9d7dc81a8607fc63"

RPROVIDES:${PN} += "libpy2UI.so.2()(64bit) \
yast2-ycp-ui-bindings \
yast2-ycp-ui-bindings(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
liby2.so.4()(64bit) \
liby2util.so.5()(64bit) \
libycp.so.5()(64bit) \
libycpvalues.so.6()(64bit) \
libyui.so.16()(64bit) \
libyui16 \
yast2-core"

inherit rpm
