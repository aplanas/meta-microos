SUMMARY = "Multipurpose relay for bidirectional data transfer"
DESCRIPTION = "socat is a relay for bidirectional data transfer between two \
independent data channels. Each of these data channels may be a file, \
pipe, device (serial line etc. or a pseudo terminal), a socket (UNIX, \
IP4, IP6 - raw, UDP, TCP), an SSL socket, proxy CONNECT connection, a \
file descriptor (stdin etc.), the GNU line editor, a program, or a \
combination of two of these."
LICENSE = "MIT & SUSE-GPL-2.0-with-openssl-exception"

PV = "1.7.4.3"

RPM_NAME = "socat-1.7.4.3-2.7.aarch64.rpm"
RPM_HASH = "fd232a76e123da961639798b377e428e72f642651b8581a8e2d5d5343c7ab6068a7ffb56f5fda8fc283a2605fc3134704249dd71660977018cd5a5cf3f56056e"

RPROVIDES:${PN} += "socat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libreadline.so.8 \
libssl.so.3 \
libwrap.so.0"

inherit rpm
