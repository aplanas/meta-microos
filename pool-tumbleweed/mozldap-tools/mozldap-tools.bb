SUMMARY = "Tools for the Mozilla LDAP C SDK"
DESCRIPTION = "The mozldap-tools package provides the ldapsearch, ldapmodify, and ldapdelete tools that use the Mozilla LDAP C SDK libraries."
LICENSE = "MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "6.0.7"

RPM_NAME = "mozldap-tools-6.0.7-4.17.aarch64.rpm"
RPM_HASH = "e5fd5b6c9650b71e012df9c72269f340cf365df3d896a64b8140805c7212141847ecde1c0e8a2fa10a63c56fc1f381e6cf314790755b90340083d48401744119"

RPROVIDES:${PN} += "mozldap-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap60.so \
libldif60.so \
libnspr4.so \
libnss3.so \
libprldap60.so \
libssldap60.so \
libsvrcore.so.0 \
mozldap-libs"

inherit rpm
