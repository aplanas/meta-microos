SUMMARY = "A tool to manage Windows dynamic disks"
DESCRIPTION = "Command-line tool for managing Microsoft Windows dynamic disks, which use \
Microsoft's LDM metadata. It can inspect them, and also create and remove \
device-mapper block devices which can be mounted."
LICENSE = "GPL-3.0-only"

PV = "0.2.4"

RPM_NAME = "ldmtool-0.2.4-2.11.aarch64.rpm"
RPM_HASH = "40a235cdae42eb0e26dcfc06d38c8b7f72963592e4807a2ba50ebc9210a58f321ed61c1c195d9e8acb269279dcb33ea131f98698adfc98ef5aa327a223cf41a8"

RPROVIDES:${PN} += "ldmtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libldm-1-0-0 \
libldm-1.0.so.0 \
libreadline.so.8"

inherit rpm
