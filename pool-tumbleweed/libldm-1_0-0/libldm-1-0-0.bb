SUMMARY = "Library to manage Windows dynamic disks"
DESCRIPTION = "Library for managing Microsoft Windows dynamic disks, which use Microsoft's \
LDM metadata. It can inspect them, and also create and remove device-mapper \
block devices which can be mounted."
LICENSE = "LGPL-3.0-only"

PV = "0.2.4"

RPM_NAME = "libldm-1_0-0-0.2.4-2.11.aarch64.rpm"
RPM_HASH = "d552daf9f7c9008392560b6ea552bc2ad158f4514c0991712d5e26ed77f93ff799c2afcd415bd118f904ab2c6040702db81abb91c67dd7774ba6f67b462e02f7"

RPROVIDES:${PN} += "libldm-1-0-0 \
libldm-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libuuid.so.1 \
libz.so.1"

inherit rpm
