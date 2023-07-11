SUMMARY = "SSSD helpers needed for Kerberos and GSSAPI authentication"
DESCRIPTION = "Provides helper processes that the LDAP and Kerberos back ends can \
use for Kerberos user or host authentication."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "sssd-krb5-common-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "f3e8ccd186b868dc477261f4b8e7382e8fedf35cb1cb353e82d608fb28f533934d9ed5d56000c214313c9bcfb19acfb9ff90e2a02dc5430aabe2625f7c0ef13a"

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
