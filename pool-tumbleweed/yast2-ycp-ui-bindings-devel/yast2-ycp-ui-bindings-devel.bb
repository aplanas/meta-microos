SUMMARY = "YaST2 - YCP Bindings for the YaST2 User Interface Engine"
DESCRIPTION = "This is the development package that makes the generic YaST2 user \
interface engine available for YCP applications (YCP is the scripting \
language in which most YaST2 modules are written)."
LICENSE = "GPL-2.0-only"

PV = "4.6.0"

RPM_NAME = "yast2-ycp-ui-bindings-devel-4.6.0-1.4.aarch64.rpm"
RPM_HASH = "06f79e58608f54a60200cb6d6f9673023f4934edfe75061d65c7e090bf4d97bdd0269ba1dff2dd8b79ebbc7afb31d8540fa0e9a9073ce48a4cc77b104e7ca8a2"

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
