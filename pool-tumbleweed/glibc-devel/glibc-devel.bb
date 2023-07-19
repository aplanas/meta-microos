SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.37"

RPM_NAME = "glibc-devel-2.37-5.1.aarch64.rpm"
RPM_HASH = "2e96c0e71f2b3afdfbc84ce4cd39035055e47155a9eadb6efc8a4cdc01c73ea63c9f3a458ba55b06cc33cb6ab41ae50de4119763bb2a665ee4ccedd61c9ebead"

RPROVIDES:${PN} += "epoll \
glibc-devel"

RDEPENDS:${PN} += "glibc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcrypt-devel \
linux-kernel-headers"

inherit rpm
