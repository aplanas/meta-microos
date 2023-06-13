SUMMARY = "FreeIPA backend plugin for sssd"
DESCRIPTION = "Provides the IPA back end that the SSSD can utilize to fetch identity \
data from and authenticate against an IPA server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-ipa-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "376e00af55f7c527d097694ab07d58d28966a07ea84d4cb04d2c105c93de7048a489d747f41bd15d3fd0c00e120337d8ee60f45f8863ecd7876803de1c691452"

RPROVIDES:${PN} += "libsss_ipa.so()(64bit) \
sssd-ipa \
sssd-ipa(aarch-64) \
sssd-ipa-provider"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdhash.so.1()(64bit) \
libdhash.so.1(DHASH_0.4.3)(64bit) \
libipa_hbac.so.0()(64bit) \
libipa_hbac.so.0(IPA_HBAC_0.0.1)(64bit) \
libipa_hbac.so.0(IPA_HBAC_0.1.0)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libldb.so.2()(64bit) \
libldb.so.2(LDB_0.9.10)(64bit) \
libndr-krb5pac.so.0()(64bit) \
libndr-krb5pac.so.0(NDR_KRB5PAC_0.0.1)(64bit) \
libndr-nbt.so.0()(64bit) \
libndr-nbt.so.0(NDR_NBT_0.0.1)(64bit) \
libndr.so.3()(64bit) \
libndr.so.3(NDR_0.0.1)(64bit) \
libsss_child.so()(64bit) \
libsss_child.so(V_2.9.0)(64bit) \
libsss_crypt.so()(64bit) \
libsss_crypt.so(V_2.9.0)(64bit) \
libsss_debug.so()(64bit) \
libsss_debug.so(V_2.9.0)(64bit) \
libsss_idmap.so.0()(64bit) \
libsss_idmap.so.0(SSS_IDMAP_0.4)(64bit) \
libsss_krb5_common.so()(64bit) \
libsss_krb5_common.so(V_2.9.0)(64bit) \
libsss_ldap_common.so()(64bit) \
libsss_ldap_common.so(V_2.9.0)(64bit) \
libsss_util.so()(64bit) \
libsss_util.so(V_2.9.0)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
libtevent.so.0()(64bit) \
libtevent.so.0(TEVENT_0.9.9)(64bit) \
sssd \
sssd-ad \
sssd-krb5-common"

inherit rpm
