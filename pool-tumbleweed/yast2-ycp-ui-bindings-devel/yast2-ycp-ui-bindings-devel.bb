SUMMARY = "YaST2 - YCP Bindings for the YaST2 User Interface Engine"
DESCRIPTION = "This is the development package that makes the generic YaST2 user \
interface engine available for YCP applications (YCP is the scripting \
language in which most YaST2 modules are written)."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-ycp-ui-bindings-devel-4.6.0-1.3.aarch64.rpm"
RPM_HASH = "df7d7b253022e2dedc207ccffae1be471dd4a2eca05982de80548d8930ebb8150b980c3701ef719425c7f97681e6f35fa2c807f1ffa4e75bc1430749ab059c05"

RPROVIDES:${PN} += "pkgconfig-yast2-ycp-ui-bindings \
yast2-ycp-ui-bindings-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boost-devel \
glibc-devel \
libstdc++-devel \
libyui-devel \
yast2-core-devel \
yast2-devtools \
yast2-ycp-ui-bindings"

inherit rpm
