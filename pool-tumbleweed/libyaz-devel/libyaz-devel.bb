SUMMARY = "Headers for the Z39.50 protocol library"
DESCRIPTION = "YAZ is a C library for developing client and server applications \
using the ANSI/NISO Z39.50 protocol for Information Retrieval."
LICENSE = "BSD-3-Clause"

PV = "5.34.0"

RPM_NAME = "libyaz-devel-5.34.0-1.4.aarch64.rpm"
RPM_HASH = "e887bb746b2236d0abcfd4996c5e343e4453caf8f7f0e05fca9eb8d0455866712e2092e47032abcdd0a07cfca032d53a96b9821c09601d5299b4e8dabbef9428"

RPROVIDES:${PN} += "libyaz-devel \
pkgconfig-yaz \
pkgconfig-yaz-icu \
pkgconfig-yaz-server"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
/usr/bin/tclsh \
libicu-devel \
libxslt-devel \
libyaz5 \
openssl-devel \
pkgconfig-icu-i18n \
pkgconfig-libexslt \
pkgconfig-yaz \
tcpd-devel \
yaz"

inherit rpm
