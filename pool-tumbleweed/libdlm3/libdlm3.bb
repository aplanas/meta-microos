SUMMARY = "Application interface to the kernel's distributed lock manager"
DESCRIPTION = "Libraries and tools that allow applications, particularly filesystems \
like OCFS2, to interface with the in-kernel distributed lock manager."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.2.0"

RPM_NAME = "libdlm3-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "ff1b3fa3bf3b5881a7fd4af8aaa1faea7ac4cdf40e67391d673ba4b65caa5e930a2529dbcf4fb7a7110d38620d08c3741162d1a020bfb711ce512c1bcead9495"

RPROVIDES:${PN} += "libdlm-lt.so.3 \
libdlm.so.3 \
libdlm3 \
libdlmcontrol.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
