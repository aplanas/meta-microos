SUMMARY = "FreeIPA backend plugin for sssd"
DESCRIPTION = "Provides the IPA back end that the SSSD can utilize to fetch identity \
data from and authenticate against an IPA server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-ipa-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "376e00af55f7c527d097694ab07d58d28966a07ea84d4cb04d2c105c93de7048a489d747f41bd15d3fd0c00e120337d8ee60f45f8863ecd7876803de1c691452"

RPROVIDES:${PN} += "libsss-ipa.so \
sssd-ipa \
sssd-ipa-provider"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libipa-hbac.so.0 \
liblber.so.2 \
libldap.so.2 \
libldb.so.2 \
libndr-krb5pac.so.0 \
libndr-nbt.so.0 \
libndr.so.3 \
libsss-child.so \
libsss-crypt.so \
libsss-debug.so \
libsss-idmap.so.0 \
libsss-krb5-common.so \
libsss-ldap-common.so \
libsss-util.so \
libtalloc.so.2 \
libtevent.so.0 \
sssd \
sssd-ad \
sssd-krb5-common"

inherit rpm
