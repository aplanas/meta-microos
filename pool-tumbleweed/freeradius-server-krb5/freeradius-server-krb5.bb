SUMMARY = "Kerberos 5 support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Kerberos 5 authentication support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-krb5-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "b61ce4c77b439c8e3bb46a28fa4e6d4d84b1f7923e6b942ae5bd7081eb178939217754dda29237a0b3814bdac3786b27bb514eff7f923d9377968f51ce9cb5ba"

RPROVIDES:${PN} += "config-freeradius-server-krb5 \
freeradius-server-krb5"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libcom-err.so.2 \
libkrb5.so.3"

inherit rpm
