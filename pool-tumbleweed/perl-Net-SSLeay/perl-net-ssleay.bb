SUMMARY = "Perl bindings for OpenSSL and LibreSSL"
DESCRIPTION = "This module provides Perl bindings for libssl (an SSL/TLS API) and \
libcrypto (a cryptography API)."
LICENSE = "Artistic-2.0"

PV = "1.92"

RPM_NAME = "perl-Net-SSLeay-1.92-1.11.aarch64.rpm"
RPM_HASH = "0cac62027541bb3817a44074f02bbe79c0226fc71c5e5ec5b2bf4e28a394e855edc30ad54baa52e067c670b4464d788ebc562af9a44c2615be11c51c8082e798"

RPROVIDES:${PN} += "perl-Net--SSLeay \
perl-Net--SSLeay--Handle \
perl-Net-SSLeay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
