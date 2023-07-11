SUMMARY = "Library to extract, create, modify, and mount WIM files"
DESCRIPTION = "wimlib is a C library for creating, extracting, modifying, and mounting files in \
the Windows Imaging Format (WIM files)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.14.1"

RPM_NAME = "libwim15-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "025d35dd513c2b62862ff88815cef188aef6e58d4a3d0b29565a57d15250fc0e0595c5d882014c8cc5fc7898d8b961b7a77bc33b792cb0c972d33272ddf4e498"

RPROVIDES:${PN} += "libwim.so.15 \
libwim15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
libntfs-3g.so.89"

inherit rpm
