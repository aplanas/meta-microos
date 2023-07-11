SUMMARY = "Application interface to the kernel's distributed lock manager"
DESCRIPTION = "Libraries and tools that allow applications, particularly filesystems \
like OCFS2, to interface with the in-kernel distributed lock manager."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.2.0"

RPM_NAME = "libdlm-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "beb88da52510a8d0e6335394642e43fe7b36b705c25a8c742175bbbf8c6d1d3192a946fe8de1f3960a935a8b6e0cfb7e8abdad3420318b61369c814d9a4f062c"

RPROVIDES:${PN} += "libdlm"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfg.so.6 \
libcmap.so.4 \
libcpg.so.4 \
libdlm.so.3 \
libdlmcontrol.so.3 \
libquorum.so.5 \
libuuid.so.1"

inherit rpm
