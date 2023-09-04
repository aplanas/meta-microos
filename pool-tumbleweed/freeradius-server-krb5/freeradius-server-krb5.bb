SUMMARY = "Kerberos 5 support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Kerberos 5 authentication support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-krb5-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "10202d8ccc3b0cbaf36563b9f43029b039329733ff07dee665c652b6162d0159be64cf2d3e29442dcedd3816b14fcd064aea6351671600e64bedc289c9ca9d23"

RPROVIDES:${PN} += "config-freeradius-server-krb5 \
freeradius-server-krb5"

RDEPENDS:${PN} += "freeradius-server \
libc.so.6 \
libcom-err.so.2 \
libkrb5.so.3"

inherit rpm
