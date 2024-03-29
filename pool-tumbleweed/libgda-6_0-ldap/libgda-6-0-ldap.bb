SUMMARY = "LDAP Provider for GNU Data Access (GDA)"
DESCRIPTION = "GNU Data Access (GDA) is an attempt to provide uniform access to \
different kinds of data sources (databases, information servers, \
mail spools, etc). It is a complete architecture that provides \
everything needed to access data."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-ldap-6.0.0-6.8.aarch64.rpm"
RPM_HASH = "358fb320fbfe4c2d908ff6984bfa97be91ec2a29f2aa094f8a51499277bdf11bb28a71e104fd648c7469db199b710d71b3c793d4620a5832b626fe25f9800bfb"

RPROVIDES:${PN} += "libgda-6-0-ldap \
libgda-ldap-6.0.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgda-6-0-6-0-0 \
libgda-6.0.so.6.0.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
liblber.so.2 \
libldap.so.2"

inherit rpm
