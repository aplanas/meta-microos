SUMMARY = "Multipurpose relay for bidirectional data transfer"
DESCRIPTION = "socat is a relay for bidirectional data transfer between two \
independent data channels. Each of these data channels may be a file, \
pipe, device (serial line etc. or a pseudo terminal), a socket (UNIX, \
IP4, IP6 - raw, UDP, TCP), an SSL socket, proxy CONNECT connection, a \
file descriptor (stdin etc.), the GNU line editor, a program, or a \
combination of two of these."
LICENSE = "MIT & SUSE-GPL-2.0-with-openssl-exception"

PV = "1.7.4.3"

RPM_NAME = "socat-1.7.4.3-2.6.aarch64.rpm"
RPM_HASH = "9c7393686bef10806cabd6825b371602d0941e59a18e182fce1ddc9b9a67aa64728bfa96cc0934d612c3dfff125d95c34f05e1d41e28dd9f5f426e8e9952d8b7"

RPROVIDES:${PN} += "socat \
socat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libreadline.so.8()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libwrap.so.0()(64bit)"

inherit rpm
