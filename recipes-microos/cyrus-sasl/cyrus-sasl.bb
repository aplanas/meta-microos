SUMMARY = "Implementation of Cyrus SASL API"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "d257672d7073d1d653069411def6adaceb11457cb0e2df9027c2317f5a07b76ac8ac13fdffd0d7413a059fc16153a718018c017b16e844f2834b1864ab42e496"

RPROVIDES:${PN} += "cyrus-sasl cyrus-sasl(aarch-64) libanonymous.so.3()(64bit) liblogin.so.3()(64bit) libsasldb.so.3()(64bit)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdbm.so.6()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libsasl2.so.3()(64bit)"

inherit rpm
