SUMMARY = "Caching and forwarding HTTP web proxy"
DESCRIPTION = "Squid is a caching proxy for the Web supporting HTTP(S), FTP, and \
some others. It reduces bandwidth and improves response times by \
caching and reusing frequently-requested web pages. Squid has \
extensive access controls and can also be used as a server \
accelerator."
LICENSE = "GPL-2.0-or-later"

PV = "5.9"

RPM_NAME = "squid-5.9-1.3.aarch64.rpm"
RPM_HASH = "419117bdfd26a645e5dfadad82d653728d1e8e9e530bd630620f029c7eee1a2613e523a0dddf2e1e30ca7646be9e2f4ae71ce5a9206733e7752ebebf62b17f21"

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
libexpat.so.1 \
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
libxml2.so.2 \
permissions \
sysuser-shadow"

inherit rpm
