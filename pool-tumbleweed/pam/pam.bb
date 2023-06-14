SUMMARY = "A Security Tool that Provides Authentication for Applications"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-1.5.3-1.1.aarch64.rpm"
RPM_HASH = "7ee170873ec624d0fcf3807b64c033d806b8f33dbebaeea00a2f71ceb0512e3cafc15e221ccf81d118ed24881068fb6a1ac2ecf5ea2d6324e5d438964a00f9cb"

RPROVIDES:${PN} += "/sbin/unix2-chkpwd \
libpam-misc.so.0 \
libpam.so.0 \
libpamc.so.0 \
pam"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
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
