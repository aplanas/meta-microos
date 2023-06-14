SUMMARY = "Utilities for Managing the Reiser4 File System"
DESCRIPTION = "A set of commands for using the Reiser4 file system, including \
mkfs.reiser4."
LICENSE = "GPL-2.0-only"

PV = "2.0.5"

RPM_NAME = "reiser4progs-2.0.5-1.7.aarch64.rpm"
RPM_HASH = "00a57e0a6a412a089721d737586388ae2ca57ad63ee2f36cbc6b471e2fe514059644df5f3ee3daa05f16fbaa26ac417ffb33918451179a2952d095c2ea779601"

RPROVIDES:${PN} += "reiser4progs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaal-1.0.so.7 \
libc.so.6 \
libreadline.so.8 \
libreiser4-2.0.so.5 \
librepair-2.0.so.5 \
libuuid.so.1"

inherit rpm
