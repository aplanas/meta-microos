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
autofs(aarch-64) \
config(autofs) \
libautofs.so()(64bit)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
aaa_base \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcom_err.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libk5crypto.so.3()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
libnsl.so.3()(64bit) \
libresolv.so.2()(64bit) \
libsasl2.so.3()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtirpc.so.3()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
