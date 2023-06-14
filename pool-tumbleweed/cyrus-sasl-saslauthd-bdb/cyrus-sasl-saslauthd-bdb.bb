SUMMARY = "The SASL Authentication Server"
DESCRIPTION = "This daemon is required when using cyrus-sasl in server software that \
should authenticate with PAM, for example."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-saslauthd-bdb-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "9cae7d9d0c4bd48751446e3f9908d66608a4faef7c8c2f585cdd16acae828d0151364ffb437a877c48fb7b1259c4b2b4446a4f6caf50c0ec53a052b08f8a02d5"

RPROVIDES:${PN} += "cyrus-sasl-saslauthd-bdb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
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
