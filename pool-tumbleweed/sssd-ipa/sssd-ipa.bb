SUMMARY = "FreeIPA backend plugin for sssd"
DESCRIPTION = "Provides the IPA back end that the SSSD can utilize to fetch identity \
data from and authenticate against an IPA server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "sssd-ipa-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "78af97c19d29062ac13bb0310cd255d93fe2af207f579e192a06030168c5ca125bf976b219f4dc0a161db0ac4bbb626e47e894d3fc1ba48246ce539b04c9c38e"

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
