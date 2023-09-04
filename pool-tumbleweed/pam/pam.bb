SUMMARY = "A Security Tool that Provides Authentication for Applications"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "pam-1.5.3-2.1.aarch64.rpm"
RPM_HASH = "34997f107d5e74f2c3bbe703f562d62bfd85914faa94d7fd21e332fe0074f62839b620f372776118ff5f450543bff90c63dc39155a04c735aab876732af9ba0c"

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
