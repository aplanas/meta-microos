SUMMARY = "Tools and libraries to work with AppStream metadata"
DESCRIPTION = "AppStream-Core makes it easy to access application information from the \
AppStream database over a nice GObject-based interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.2"

RPM_NAME = "AppStream-0.16.2-1.1.aarch64.rpm"
RPM_HASH = "26441d02b415cb9f306ad16321a5daed6d3c975a2ffe060f0296aae1360d4dd727f97f30b6f8fdec8b248647111cd9baf6c1caf07b54ce04857344bfd2cf4fbd"

RPROVIDES:${PN} += "AppStream \
config-AppStream"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libappstream.so.4 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
