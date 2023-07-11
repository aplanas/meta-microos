SUMMARY = "Library for performing DKIM signing and verification"
DESCRIPTION = "This package provides the shared library libopendkim which \
performs DKIM signing and verification."
LICENSE = "BSD-3-Clause & Sendmail"

PV = "2.11.0"

RPM_NAME = "libopendkim11-2.11.0-7.16.aarch64.rpm"
RPM_HASH = "1114ecf757c72ad8d06d83f614b363415781c6c8eb103572f806bcb194ce05fe507c827b7839bf1e4e345d6d15508271a46112aeca5f3c18ca6753d173ef5804"

RPROVIDES:${PN} += "libopendkim.so.11 \
libopendkim11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libtre.so.5"

inherit rpm
