SUMMARY = "Kernel Symbol Versions (modversions)"
DESCRIPTION = "Kernel symbols, such as functions and variables, have version \
information attached to them. This package contains the symbol versions \
for the standard kernels. \
 \
This package is needed for compiling kernel module packages with proper \
package dependencies. \
 \
 \
Source Timestamp: 2023-08-17 04:57:43 +0000 \
GIT Revision: 2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "kernel-syms-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "75257fcd617b9737634ccc8a42d049b6483e8f1cab7bf361b6676e4367571b33cd18240fddac1f2795924b771231e3078d6725113c6d6ee21488e210e208f63b"

RPROVIDES:${PN} += "kernel-syms \
kernel-syms-srchash-2a5b3f66898e9ecfa282f4399923c9546d3bc54d \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-64kb-devel \
kernel-default-devel \
kernel-devel \
pesign-obs-integration"

inherit rpm
