SUMMARY = "The SASL Authentication Server"
DESCRIPTION = "This daemon is required when using cyrus-sasl in server software that \
should authenticate with PAM, for example."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-saslauthd-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "1fbea5c4cf541fb4e52b8afebc4ec025f69a91fada260b30feae5e86e9472d7233bd3aa6d799271102e7df8f784083cf5b0de4428042f3f1f83ee903b15131fb"

RPROVIDES:${PN} += "cyrus-sasl-saslauthd \
cyrus-sasl-saslauthd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
systemd"

inherit rpm
