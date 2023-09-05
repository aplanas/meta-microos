SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.38"

RPM_NAME = "glibc-devel-2.38-2.1.aarch64.rpm"
RPM_HASH = "90942a5483de7b734a4e4384e9b550c6b9811c11955a1c56ea8ea5a04b215c72b5c6d0f559bece2a9c03e6f332a46055ea6116abacf1216058137a9ff25a68d0"

RPROVIDES:${PN} += "epoll \
glibc-devel"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcrypt-devel \
linux-kernel-headers"

inherit rpm
