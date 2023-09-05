SUMMARY = "A Security Tool that Provides Authentication for Applications"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-1.5.3-3.1.aarch64.rpm"
RPM_HASH = "253914fefe3da2b332cd26d177632c947412f47a8182a7bc1224a9642fd5af9c1e84eb4d1564335717ad5305801d7395bfeb3040d827c8d66dc925595c545ff8"

RPROVIDES:${PN} += "/sbin/unix2-chkpwd \
libpam-misc.so.0 \
libpam.so.0 \
libpamc.so.0 \
pam"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
group-shadow \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcrypt.so.1 \
libeconf.so.0 \
libselinux.so.1 \
permissions \
user-root"

inherit rpm
