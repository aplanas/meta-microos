SUMMARY = "Share your terminal over the web"
DESCRIPTION = "Ttyd is a simple command-line tool for sharing terminal over the web, inspired \
by GoTTY. \
 \
Features include: \
 * Built on top of Libwebsockets with C for speed \
 * Fully-featured terminal based on Xterm.js with CJK and IME support \
 * SSL support based on OpenSSL \
 * Run any custom command with options \
 * Basic authentication support and many other custom options \
 * Cross platform: macOS, Linux, FreeBSD, OpenWrt/LEDE, Windows"
LICENSE = "MIT"

PV = "1.7.3"

RPM_NAME = "ttyd-1.7.3-1.2.aarch64.rpm"
RPM_HASH = "9983d49e52e26eb2ea8390e4dd1808c25ded1143f869d87f00a7ca201c424f2689d683d7a057f883148f1f16bed4e62e9c446b70d7b3b9f5da8eb9238c8bc52b"

RPROVIDES:${PN} += "ttyd \
ttyd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libuv.so.1()(64bit) \
libwebsockets.so.19()(64bit) \
libz.so.1()(64bit)"

inherit rpm
