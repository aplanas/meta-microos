SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "glibc-devel-2.37-4.4.aarch64.rpm"
RPM_HASH = "5ab2bc24e41bfaf79e403a6c2cac9ae14b72b09903f2f3f3713316ef13a8a6cdabc9c965cc4de410952d9ab64ab7da4eb59b9fe2406b62e987fd93fb55066420"

RPROVIDES:${PN} += "epoll \
glibc-devel"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcrypt-devel \
linux-kernel-headers"

inherit rpm
