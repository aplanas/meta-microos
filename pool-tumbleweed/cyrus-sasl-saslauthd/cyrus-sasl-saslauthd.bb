SUMMARY = "The SASL Authentication Server"
DESCRIPTION = "This daemon is required when using cyrus-sasl in server software that \
should authenticate with PAM, for example."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-saslauthd-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "1fbea5c4cf541fb4e52b8afebc4ec025f69a91fada260b30feae5e86e9472d7233bd3aa6d799271102e7df8f784083cf5b0de4428042f3f1f83ee903b15131fb"

RPROVIDES:${PN} += "cyrus-sasl-saslauthd"

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
