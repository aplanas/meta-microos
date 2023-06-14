SUMMARY = "SSSD helpers needed for Kerberos and GSSAPI authentication"
DESCRIPTION = "Provides helper processes that the LDAP and Kerberos back ends can \
use for Kerberos user or host authentication."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-krb5-common-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "88895ee04dfb177eb16612399d096195cbd5226b08da255d4f75c3eff05c9310989d768bf2149c60f481e54ea431d51a550a46babc6a65d39dc6906b0100c6fe"

RPROVIDES:${PN} += "libsss-krb5-common.so \
sssd-krb5-common"

RDEPENDS:${PN} += "cyrus-sasl-gssapi \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdhash.so.1 \
libjansson.so.4 \
libkeyutils.so.1 \
libkrb5.so.3 \
libldb.so.2 \
libpopt.so.0 \
libsss-child.so \
libsss-debug.so \
libsss-util.so \
libsystemd.so.0 \
libtalloc.so.2 \
libtevent.so.0"

inherit rpm
