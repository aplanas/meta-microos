SUMMARY = "A MIME-Capable Implementation of the mailx Command"
DESCRIPTION = "Nail is a mail user agent derived from Berkeley Mail 8.1.  It is \
intended to provide the functionality of the POSIX.2 mailx command with \
additional support for MIME messages, POP3, and SMTP.  In recent system \
environments, nail is Unicode/UTF-8 capable.  Further, it contains some \
minor enhancements like the ability to set a 'From:' address."
LICENSE = "BSD-4-Clause & MPL-1.1"

PV = "12.5"

RPM_NAME = "mailx-12.5-35.5.aarch64.rpm"
RPM_HASH = "89119681a0eea5d7751ac79127b41105052364bafca4a19dcb7e6ff6fa0edff8570881356274dc2945f9a243df76bc3099384436a2c6202c1e324513e31e9ae7"

RPROVIDES:${PN} += "config-mailx \
mail \
mailx"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libssl.so.3"

inherit rpm
