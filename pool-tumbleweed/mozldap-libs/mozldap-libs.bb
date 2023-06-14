SUMMARY = "Mozilla LDAP C SDK"
DESCRIPTION = "The Mozilla LDAP C SDK is a set of libraries that allow applications to communicate with LDAP directory servers. \
These libraries are derived from the University of Michigan and Netscape LDAP libraries. They use Mozilla NSPR and NSS for crypto."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "6.0.7"

RPM_NAME = "mozldap-libs-6.0.7-4.15.aarch64.rpm"
RPM_HASH = "1394909a706165fca2f0fe84b0290f87aa9d76b422d2d4ecc9590c0f21402d5acfb48a4c21605fc8d7963361db41ffdc420409955132a45875b61e1392419a8c"

RPROVIDES:${PN} += "libldap60.so \
libldif60.so \
libprldap60.so \
libssldap60.so \
mozldap \
mozldap-libs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libnss3.so \
libplc4.so \
libplds4.so \
libsasl2.so.3 \
libssl3.so"

inherit rpm
