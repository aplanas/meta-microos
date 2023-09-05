SUMMARY = "Kernel Symbol Versions (modversions)"
DESCRIPTION = "Kernel symbols, such as functions and variables, have version \
information attached to them. This package contains the symbol versions \
for the standard kernels. \
 \
This package is needed for compiling kernel module packages with proper \
package dependencies. \
 \
 \
Source Timestamp: 2023-08-25 08:26:31 +0000 \
GIT Revision: f5aa89b3e95322c79e43c459f5b6862dec51fc5f \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "kernel-syms-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "e4a4aca33380db85ac367105708c405230a8bb0c48b563cab4dcb84327973929a1001e50e6186a595fcf4c3a8be8cf2cc1e594de75bcccfa2819fe02972d1297"

RPROVIDES:${PN} += "kernel-syms \
kernel-syms-srchash-f5aa89b3e95322c79e43c459f5b6862dec51fc5f \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-64kb-devel \
kernel-default-devel \
kernel-devel \
pesign-obs-integration"

inherit rpm
