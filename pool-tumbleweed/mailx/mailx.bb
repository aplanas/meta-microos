SUMMARY = "A MIME-Capable Implementation of the mailx Command"
DESCRIPTION = "Nail is a mail user agent derived from Berkeley Mail 8.1.  It is \
intended to provide the functionality of the POSIX.2 mailx command with \
additional support for MIME messages, POP3, and SMTP.  In recent system \
environments, nail is Unicode/UTF-8 capable.  Further, it contains some \
minor enhancements like the ability to set a 'From:' address."
LICENSE = "BSD-4-Clause & MPL-1.1"

PV = "12.5"

RPM_NAME = "mailx-12.5-35.4.aarch64.rpm"
RPM_HASH = "06ba84d1ed332d631334e24fd20dd57c057fd318db47d394b5ca9096c735f30192181e5ed72f7180a5b9e6426873d4abae48b857c988b1d6385329fcceb44975"

RPROVIDES:${PN} += "config(mailx) \
mail \
mailx \
mailx(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
alts \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
