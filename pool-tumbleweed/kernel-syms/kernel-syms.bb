SUMMARY = "Kernel Symbol Versions (modversions)"
DESCRIPTION = "Kernel symbols, such as functions and variables, have version \
information attached to them. This package contains the symbol versions \
for the standard kernels. \
 \
This package is needed for compiling kernel module packages with proper \
package dependencies. \
 \
 \
Source Timestamp: 2023-07-25 04:42:30 +0000 \
GIT Revision: 55520bc826c5b1d40857ed0536eb87438cb95192 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "kernel-syms-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "5167c3bc1a38b563d50285fa55aed42c10ace6dda2faf6eda5729e628e7a20fbac1ac5178d50072a7685a33f21b0640fd7e0c78a0be1f02fd1f73a36e82f84fe"

RPROVIDES:${PN} += "kernel-syms \
kernel-syms-srchash-55520bc826c5b1d40857ed0536eb87438cb95192 \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-64kb-devel \
kernel-default-devel \
kernel-devel \
pesign-obs-integration"

inherit rpm
