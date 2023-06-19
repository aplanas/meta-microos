SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "glibc-devel-2.37-4.1.aarch64.rpm"
RPM_HASH = "6230f5c7f12a4ad77505edf556b0bfd43dada09d47ad27d256d239642efc49dcfd8b2711e6f174ff5dcd01198b97a3c197d077b1dc1afd220b03ccba6422b1ce"

RPROVIDES:${PN} += "epoll \
glibc-devel"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcrypt-devel \
linux-kernel-headers"

inherit rpm
