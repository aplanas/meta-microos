SUMMARY = "The Kerberos authentication backend plugin for sssd"
DESCRIPTION = "Provides the Kerberos back end that the SSSD can utilize authenticate \
against a Kerberos server."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-krb5-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "d825bc1cae527833dd7f650d9921adecc9e98d4ba2039cec308820cd81aa59ed2cd0649fe2f77447d2d6b8bdbdcc5827d9c4481039fa5d3bf9d3a6bb45fdcf1a"

RPROVIDES:${PN} += "libsss-krb5.so \
sssd-krb5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsss-debug.so \
libsss-krb5-common.so \
libsss-util.so \
libtalloc.so.2 \
sssd-krb5-common"

inherit rpm
