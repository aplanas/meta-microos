SUMMARY = "Kerberos 5 support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Kerberos 5 authentication support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-krb5-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "6e1ecba523b90167e5f86c20dbf2a433f29a26250f956907c1f322143655af22c5f86e13c16cb391de82c1e87024ceb56a1d130fb3770d398ae0ec152bd3c816"

RPROVIDES:${PN} += "config-freeradius-server-krb5 \
freeradius-server-krb5"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libcom-err.so.2 \
libkrb5.so.3"

inherit rpm
