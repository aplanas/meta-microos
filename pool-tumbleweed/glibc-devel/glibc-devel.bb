SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.38"

RPM_NAME = "glibc-devel-2.38-1.1.aarch64.rpm"
RPM_HASH = "efe7d7facaeede8e16b0011eab671d27ed2e3235a630f63cfaa707c2f3f3c347be552242ce8da8f40994b230ea83dc05c0d56d23c06373c58d5385fec2c6215a"

RPROVIDES:${PN} += "epoll \
glibc-devel"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcrypt-devel \
linux-kernel-headers"

inherit rpm
