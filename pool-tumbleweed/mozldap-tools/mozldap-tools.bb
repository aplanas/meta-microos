SUMMARY = "Tools for the Mozilla LDAP C SDK"
DESCRIPTION = "The mozldap-tools package provides the ldapsearch, ldapmodify, and ldapdelete tools that use the Mozilla LDAP C SDK libraries."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "6.0.7"

RPM_NAME = "mozldap-tools-6.0.7-4.15.aarch64.rpm"
RPM_HASH = "e5b3d6ec7bbdd5db1d0bbdca581926a2ce1348a1301ba48c3c220f837c7ffcd957f400efe93df0e37326997c9a231661d0e7227a9ff469a2e4287824e97a34bb"

RPROVIDES:${PN} += "mozldap-tools \
mozldap-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libldap60.so()(64bit) \
libldif60.so()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libprldap60.so()(64bit) \
libssldap60.so()(64bit) \
libsvrcore.so.0()(64bit) \
mozldap-libs"

inherit rpm
