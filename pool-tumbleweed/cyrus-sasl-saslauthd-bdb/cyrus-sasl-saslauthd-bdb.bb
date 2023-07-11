SUMMARY = "The SASL Authentication Server"
DESCRIPTION = "This daemon is required when using cyrus-sasl in server software that \
should authenticate with PAM, for example."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-saslauthd-bdb-2.1.28-5.2.aarch64.rpm"
RPM_HASH = "6ef4bb6f75f564e87a1a9680f8bea309242d0edd4bcb181b763a92677dd735dd764d997a6ab179a3fc8257b307af746e8283d242b8208e11a730285e89437d83"

RPROVIDES:${PN} += "cyrus-sasl-saslauthd-bdb"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libpam.so.0 \
systemd"

inherit rpm
