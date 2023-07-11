SUMMARY = "The Internet Junkbuster - HTTP Proxy Server"
DESCRIPTION = "The Internet Junkbuster - HTTP Proxy Server: A non-caching HTTP proxy \
server that runs between a web browser and a web server and filters \
contents as described in the configuration files."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.34"

RPM_NAME = "privoxy-3.0.34-1.4.aarch64.rpm"
RPM_HASH = "2f89a943b0d49ec120e5b8953ac4f1335e7dfc2185797d341811bc6f7994baff8870b86d7603ebcdc1e63625053e823cc1abbf7b1db9d18e03ec52751466c764"

RPROVIDES:${PN} += "config-privoxy \
privoxy"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre.so.1 \
libpcreposix.so.0 \
libssl.so.3 \
libz.so.1 \
logrotate"

inherit rpm
