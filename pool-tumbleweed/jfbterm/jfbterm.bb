SUMMARY = "Framebuffer Terminal to Display Japanese Characters"
DESCRIPTION = "JFBTERM is a program to display Japanese Kanji characters using the \
framebuffer. Similar to the well-known program kon, it uses a terminal \
emulator on the console and hooks into its output. But JFBTERM does not \
use VGA (like kon does). It uses the framebuffer instead."
LICENSE = "BSD-3-Clause"

PV = "0.4.7"

RPM_NAME = "jfbterm-0.4.7-11.27.aarch64.rpm"
RPM_HASH = "bb5c484cb1506a48ea613f0507ab2cf97e50ccd959ca7adf2119b54aaf8fd5265852e10206ceb9aaafdcedc1bf1a3c7d059d953d3afc5bfcbd3fc8365455ceac"

RPROVIDES:${PN} += "config(jfbterm) \
jfbterm \
jfbterm(aarch-64)"
RDEPENDS:${PN} += "/bin/cat \
/bin/sh \
/usr/bin/grep \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
permissions"

inherit rpm
