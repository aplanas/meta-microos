SUMMARY = "The nginx source"
DESCRIPTION = "The source of nginx [engine x] HTTP server and IMAP/POP3 proxy server."
LICENSE = "BSD-2-Clause"

PV = "1.25.1"

RPM_NAME = "nginx-source-1.25.1-1.1.noarch.rpm"
RPM_HASH = "c8ff76aa1c31ae5e9835f4c1699ec4dd7fad80cbff0abe774d3bc4213d85a99a3748a4aa5a792f466ddcc88c4da6e8f6e3bcbe94fd4602e4f5f6db58c2f6f9f9"
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
