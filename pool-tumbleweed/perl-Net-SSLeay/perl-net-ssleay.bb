SUMMARY = "Perl bindings for OpenSSL and LibreSSL"
DESCRIPTION = "This module provides Perl bindings for libssl (an SSL/TLS API) and \
libcrypto (a cryptography API)."
LICENSE = "Artistic-2.0"

PV = "1.92"

RPM_NAME = "perl-Net-SSLeay-1.92-1.12.aarch64.rpm"
RPM_HASH = "ae9c5363d2daee681a20ff3a24bd7a2824abaa53824382f08aae06df48ae9fe3c899a3a9ee14ce663f63bca4974fe0051dc8ab18d7b1f38e86abdd1341c28754"

RPROVIDES:${PN} += "perl-Net--SSLeay \
perl-Net--SSLeay--Handle \
perl-Net-SSLeay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
