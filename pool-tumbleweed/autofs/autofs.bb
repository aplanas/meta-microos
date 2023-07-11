SUMMARY = "A Kernel-Based Automounter"
DESCRIPTION = "AutoFS is a kernel-based automounter for Linux.  It automatically \
mounts filesystems when you use them, and unmounts them later when \
you are not using them.  This can include network filesystems, CD-ROMs, \
floppies, and so forth."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.8"

RPM_NAME = "autofs-5.1.8-5.5.aarch64.rpm"
RPM_HASH = "ac7754316c49cdcf22c0bed22ee208b704f6bb88ab4bea1f2615aa62039575e0910dd913b89da51a380716029a1c2460245b86a3f2e2185c0072c33041a577f6"

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
