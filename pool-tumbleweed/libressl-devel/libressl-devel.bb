SUMMARY = "Development files for LibreSSL, an SSL/TLS protocol implementation"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. It derives from \
OpenSSL, with the aim of refactoring the OpenSSL code so as to \
provide a more secure implementation. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libressl."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libressl-devel-3.7.0-1.3.aarch64.rpm"
RPM_HASH = "220622738ed1b9529c7229cd4843788a04ca2575fe2f76adb1b4e91e61ae8843fedff5472de584c378d55a84faf45a5012965afddc21a2b46f139b25e1b6d7a3"

RPROVIDES:${PN} += "libressl-devel \
pkgconfig-libcrypto \
pkgconfig-libssl \
pkgconfig-libtls \
pkgconfig-openssl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcrypto50 \
libssl53 \
libtls26 \
pkgconfig-libcrypto \
pkgconfig-libssl"

inherit rpm
