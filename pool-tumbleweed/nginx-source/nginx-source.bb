SUMMARY = "The nginx source"
DESCRIPTION = "The source of nginx [engine x] HTTP server and IMAP/POP3 proxy server."
LICENSE = "BSD-2-Clause"

PV = "1.25.2"

RPM_NAME = "nginx-source-1.25.2-1.1.noarch.rpm"
RPM_HASH = "2ff91c2bf5b79c66c77e902975369c0809547a3669516a708497452c2c94b1274f02819fba33babd8dbb3f031e7c20cf0eafbbfe819e5b5e975cc025d583ae8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nginx-source \
perl-nginx"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
gcc-c++ \
libatomic-ops-devel \
nginx \
nginx-macros \
pkgconfig \
pkgconfig-gdlib \
pkgconfig-libpcre2-8 \
pkgconfig-libxslt \
pkgconfig-openssl \
pkgconfig-zlib \
vim"

inherit rpm
