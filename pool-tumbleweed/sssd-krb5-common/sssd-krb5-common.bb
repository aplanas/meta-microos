SUMMARY = "SSSD helpers needed for Kerberos and GSSAPI authentication"
DESCRIPTION = "Provides helper processes that the LDAP and Kerberos back ends can \
use for Kerberos user or host authentication."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "sssd-krb5-common-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "0d0240edb2f64f0e1ede530bdd69bd671cf26d4d4f1413a05a79d7d932c728ca9b7e7e893421efb2245859e73ac1479f7149647550dff3c36628a88a1e5362ac"

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
