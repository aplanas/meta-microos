SUMMARY = "A Kernel-Based Automounter"
DESCRIPTION = "AutoFS is a kernel-based automounter for Linux.  It automatically \
mounts filesystems when you use them, and unmounts them later when \
you are not using them.  This can include network filesystems, CD-ROMs, \
floppies, and so forth."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.8"

RPM_NAME = "autofs-5.1.8-5.4.aarch64.rpm"
RPM_HASH = "849f74c013616525a90a0160cbee10600cd927991e30d7acaa4afb0fd5c36b83e96b0617d53789315eceafdf6b6630c4bf11b444594fedcc7946db04310a904c"

RPROVIDES:${PN} += "autofs \
config-autofs \
libautofs.so"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
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
