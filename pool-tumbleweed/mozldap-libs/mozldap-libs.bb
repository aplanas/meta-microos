SUMMARY = "Mozilla LDAP C SDK"
DESCRIPTION = "The Mozilla LDAP C SDK is a set of libraries that allow applications to communicate with LDAP directory servers. \
These libraries are derived from the University of Michigan and Netscape LDAP libraries. They use Mozilla NSPR and NSS for crypto."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "6.0.7"

RPM_NAME = "mozldap-libs-6.0.7-4.17.aarch64.rpm"
RPM_HASH = "ba381dd6584b9160e63b11aef3b9e31a53ab8af09146819941d169af94044f1c2e66faf01febe61abea32e83ec117e6aca085147d4ada3846f1ba55b62d546b1"

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
