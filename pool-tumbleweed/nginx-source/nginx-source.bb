SUMMARY = "The nginx source"
DESCRIPTION = "The source of nginx [engine x] HTTP server and IMAP/POP3 proxy server."
LICENSE = "BSD-2-Clause"

PV = "1.25.0"

RPM_NAME = "nginx-source-1.25.0-1.1.noarch.rpm"
RPM_HASH = "457ec4452f7cad084e288d0ac84ed6037179dd7e33d9f1c0dddffadb5b012fa006cef1ffc04b4105a95f22cbc70aa53498fb0141443759412427023f672b152d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nginx-source \
perl(nginx)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
gcc-c++ \
libatomic-ops-devel \
nginx \
nginx-macros \
pkgconfig \
pkgconfig(gdlib) \
pkgconfig(libpcre2-8) \
pkgconfig(libxslt) \
pkgconfig(openssl) \
pkgconfig(zlib) \
vim"

inherit rpm
