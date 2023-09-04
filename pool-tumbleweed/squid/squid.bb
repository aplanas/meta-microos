SUMMARY = "Caching and forwarding HTTP web proxy"
DESCRIPTION = "Squid is a caching proxy for the Web supporting HTTP(S), FTP, and \
some others. It reduces bandwidth and improves response times by \
caching and reusing frequently-requested web pages. Squid has \
extensive access controls and can also be used as a server \
accelerator."
LICENSE = "GPL-2.0-or-later"

PV = "6.2"

RPM_NAME = "squid-6.2-1.1.aarch64.rpm"
RPM_HASH = "7aac522bb891599ad1037dbcb74a3237718f526b9775a50d6d3f34c39ec75d5ea1f8a53afc503edcb00e0086171feec7f3058e51324a8eebd1b7564f19e133b0"

RPROVIDES:${PN} += "config-squid \
group-squid \
group-winbind \
http-proxy \
squid \
user-squid"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sed \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcom-err.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libltdl.so.7 \
libm.so.6 \
libnettle.so.8 \
libpam.so.0 \
libsasl2.so.3 \
libssl.so.3 \
libstdc++.so.6 \
libtdb.so.1 \
permissions \
sysuser-shadow"

inherit rpm
