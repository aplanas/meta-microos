SUMMARY = "Kernel Symbol Versions (modversions)"
DESCRIPTION = "Kernel symbols, such as functions and variables, have version \
information attached to them. This package contains the symbol versions \
for the standard kernels. \
 \
This package is needed for compiling kernel module packages with proper \
package dependencies. \
 \
 \
Source Timestamp: 2023-07-11 06:23:11 +0000 \
GIT Revision: 5ab030f1f07fd96746960bce337ec62fc11b6a9a \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "kernel-syms-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "37903433ee049d2ff258f7d95ca3c4d35fea108832ac270c7176b84584f757f1dfe57c6eb45a41faa9a7af0de96bfce33a38934045d77cf4e895bfa52171362c"

RPROVIDES:${PN} += "kernel-syms \
kernel-syms-srchash-5ab030f1f07fd96746960bce337ec62fc11b6a9a \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-64kb-devel \
kernel-default-devel \
kernel-devel \
pesign-obs-integration"

inherit rpm
