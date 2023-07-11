SUMMARY = "Kernel Symbol Versions (modversions)"
DESCRIPTION = "Kernel symbols, such as functions and variables, have version \
information attached to them. This package contains the symbol versions \
for the standard kernels. \
 \
This package is needed for compiling kernel module packages with proper \
package dependencies. \
 \
 \
Source Timestamp: 2023-06-22 03:53:43 +0000 \
GIT Revision: 0df701dd2c208f4843cf219b4b26b533ada9bd34 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "kernel-syms-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "f02f09e4f4fc2128387e367f9a627ad43111816e6207a691df66b9bff0e832abec457c5b6f8b250abd5beb862d1ac14d4fe5ddfe9cf80d68ef8a99f3e144b8be"

RPROVIDES:${PN} += "kernel-syms \
kernel-syms-srchash-0df701dd2c208f4843cf219b4b26b533ada9bd34 \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-64kb-devel \
kernel-default-devel \
kernel-devel \
pesign-obs-integration"

inherit rpm
