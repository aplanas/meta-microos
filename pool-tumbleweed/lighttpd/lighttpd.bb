SUMMARY = "A Secure, Fast, Compliant, and Very Flexible Web Server"
DESCRIPTION = "Lighttpd is a secure, fast, compliant, and very flexible Web server \
that has been optimized for high-performance environments. It has a \
very low memory footprint compared to other Web servers and takes care \
of CPU load. Its advanced feature set (FastCGI, CGI, Auth, \
Output-Compression, URL-Rewriting, and more) makes lighttpd the perfect \
Web server software for every server that is suffering load problems."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "3feaabfaabecfe0e8582899bcfb695f270de6596c58c747d5a6699421b6d945b7a275616d59f800afd3e176e024c2ccc42fbb07f0160fcd54c4122aaf3bd9427"

RPROVIDES:${PN} += "config-lighttpd \
http-daemon \
httpd \
lighttpd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libbrotlienc.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libdbi.so.3 \
libpcre2-8.so.0 \
libssl.so.3 \
libz.so.1 \
libzstd.so.1 \
shadow \
spawn-fcgi \
systemd"

inherit rpm
