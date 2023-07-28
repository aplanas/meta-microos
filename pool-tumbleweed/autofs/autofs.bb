SUMMARY = "A Kernel-Based Automounter"
DESCRIPTION = "AutoFS is a kernel-based automounter for Linux.  It automatically \
mounts filesystems when you use them, and unmounts them later when \
you are not using them.  This can include network filesystems, CD-ROMs, \
floppies, and so forth."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.8"

RPM_NAME = "autofs-5.1.8-6.1.aarch64.rpm"
RPM_HASH = "e1fdd97e1cae79b3ff4257f1976182728be6ce3cd655a8613de6ff2addd4ae985c64ca6e2ca9e47667c0d9a98ea3c80017f32624aeb1206b1c87a165cb01382e"

RPROVIDES:${PN} += "autofs \
config-autofs \
libautofs.so"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
aaa-base \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libdbus-1.so.3 \
libk5crypto.so.3 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libnsl.so.3 \
libresolv.so.2 \
libsasl2.so.3 \
libsystemd.so.0 \
libtirpc.so.3 \
libxml2.so.2"

inherit rpm
