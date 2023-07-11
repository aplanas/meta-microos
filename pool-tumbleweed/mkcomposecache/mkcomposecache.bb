SUMMARY = "Utility to create Compose cache files"
DESCRIPTION = "mkcomposecache is used for creating global (system-wide) Compose cache files. \
 \
Compose cache files help with application startup times and memory usage, \
especially in locales with large Compose tables (e.g. all UTF-8 locales)."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "mkcomposecache-1.2.2-1.6.aarch64.rpm"
RPM_HASH = "e95f629210592f26d6f479796c81f171301d2b6c520d810656ba100c97dd9d8ac273d45ee3aa2b2b886deec5cdbeec825559e71edf0ba2565a35565b35cfb70a"

RPROVIDES:${PN} += "mkcomposecache"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6"

inherit rpm
