SUMMARY = "Configuration utilities for bcache"
DESCRIPTION = "This package contains utilities for configuring the bcache Module."
LICENSE = "GPL-2.0-only"

PV = "1.1"

RPM_NAME = "bcache-tools-1.1-7.4.aarch64.rpm"
RPM_HASH = "d66b3860bc75554d275b573f2d9921e8b97ad231b84af25b3716001fa732dcee81e0ab5d1a5598f5f4a5601faaa62364717a38bb776204f5e846a997f18f7522"

RPROVIDES:${PN} += "bcache-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
