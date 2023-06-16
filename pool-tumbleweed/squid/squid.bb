SUMMARY = "Caching and forwarding HTTP web proxy"
DESCRIPTION = "Squid is a caching proxy for the Web supporting HTTP(S), FTP, and \
some others. It reduces bandwidth and improves response times by \
caching and reusing frequently-requested web pages. Squid has \
extensive access controls and can also be used as a server \
accelerator."
LICENSE = "GPL-2.0-or-later"

PV = "5.9"

RPM_NAME = "squid-5.9-1.1.aarch64.rpm"
RPM_HASH = "aae8fdf9a730b920964a29eb238561e3793e57e5f1bada70aaf14b9b73335366a95e3c118434876561034ab89d74c203d8b8fe9a7a30af766981dddadc9b7c3f"

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
