SUMMARY = "A Security Tool that Provides Authentication for Applications"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-1.5.3-1.2.aarch64.rpm"
RPM_HASH = "39df61126502b9a41d95456ace0bc57dc51832754764af0f312f0cd0461a446a3e03cd85518d738654aa9a6c3cfe165158064b2d690d08c3385f2b2d6139c9bf"

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
