SUMMARY = "The SASL Authentication Server"
DESCRIPTION = "This daemon is required when using cyrus-sasl in server software that \
should authenticate with PAM, for example."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-saslauthd-2.1.28-5.2.aarch64.rpm"
RPM_HASH = "bb8b7a09d383cd89230956efa7c95835a5cfa888dea9596c6ce6f71542b31e23c39bb022420d5f93e064b3799636c3edebb0ecca80a110d3120e5e2f36944913"

RPROVIDES:${PN} += "cyrus-sasl-saslauthd"

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
