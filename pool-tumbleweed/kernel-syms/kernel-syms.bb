SUMMARY = "Kernel Symbol Versions (modversions)"
DESCRIPTION = "Kernel symbols, such as functions and variables, have version \
information attached to them. This package contains the symbol versions \
for the standard kernels. \
 \
This package is needed for compiling kernel module packages with proper \
package dependencies. \
 \
 \
Source Timestamp: 2023-05-29 06:22:29 +0000 \
GIT Revision: 2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
GIT Branch: stable"
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "kernel-syms-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "489aff83a97e720c5ace25a08ad0519e79ab845cc0ee7e3c4a8b1dbe1a4db04331f557950dd2903574fec6928aa9ecdcd1fdae025638bf36dea03190bd3638d4"

RPROVIDES:${PN} += "kernel-syms \
kernel-syms-srchash-2c66b1f470678d30f7dc560d1f3770e6e13b5e65 \
multiversion-kernel"

RDEPENDS:${PN} += "kernel-64kb-devel \
kernel-default-devel \
kernel-devel \
pesign-obs-integration"

inherit rpm
