SUMMARY = "Framebuffer Terminal to Display Japanese Characters"
DESCRIPTION = "JFBTERM is a program to display Japanese Kanji characters using the \
framebuffer. Similar to the well-known program kon, it uses a terminal \
emulator on the console and hooks into its output. But JFBTERM does not \
use VGA (like kon does). It uses the framebuffer instead."
LICENSE = "BSD-3-Clause"

PV = "0.4.7"

RPM_NAME = "jfbterm-0.4.7-11.28.aarch64.rpm"
RPM_HASH = "fde1a92ea3f4dacc46ecd490acd0ed7ee39bffa59e9eb7263d436f4fbed0a75c629e6873cecd3f77334e844278af6ea83d04f65d1884b8b0d065f3a4a821658d"

RPROVIDES:${PN} += "config-jfbterm \
jfbterm"

RDEPENDS:${PN} += "/usr/bin/cat \
/usr/bin/grep \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
permissions"

inherit rpm
