SUMMARY = "The Kerberos authentication backend plugin for sssd"
DESCRIPTION = "Provides the Kerberos back end that the SSSD can utilize authenticate \
against a Kerberos server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-krb5-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "d825bc1cae527833dd7f650d9921adecc9e98d4ba2039cec308820cd81aa59ed2cd0649fe2f77447d2d6b8bdbdcc5827d9c4481039fa5d3bf9d3a6bb45fdcf1a"

RPROVIDES:${PN} += "libsss_krb5.so()(64bit) \
sssd-krb5 \
sssd-krb5(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsss_debug.so()(64bit) \
libsss_debug.so(V_2.9.0)(64bit) \
libsss_krb5_common.so()(64bit) \
libsss_krb5_common.so(V_2.9.0)(64bit) \
libsss_util.so()(64bit) \
libsss_util.so(V_2.9.0)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
sssd-krb5-common"

inherit rpm
