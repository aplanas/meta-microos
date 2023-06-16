SUMMARY = "Daemon to restore SELinux contexts"
DESCRIPTION = "Daemon that watches for file creation and then sets the default SELinux file context"
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "restorecond-3.5-1.2.aarch64.rpm"
RPM_HASH = "fd6fd545a263fd30e6e4ca87c6c266d7ba49f5d49e45d65b8a3dd095a9d11cacf8388e21ebedb2dc49516883fb4fee2966520ef3a5dfc2d5b194387c94c69387"

RPROVIDES:${PN} += "config-restorecond \
restorecond"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libselinux.so.1 \
libselinux1 \
selinux-tools"

inherit rpm
