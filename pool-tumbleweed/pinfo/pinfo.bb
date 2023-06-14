SUMMARY = "Lynx-style Info Browser"
DESCRIPTION = "Pinfo is a curses based, Lynx-style info browser."
LICENSE = "GPL-2.0-only"

PV = "0.6.13"

RPM_NAME = "pinfo-0.6.13-2.7.aarch64.rpm"
RPM_HASH = "a1481bc29037b0d71c061944a1c9dd8b4469be67df702d623dd3678399bfaf83d911e0aefa4c66e88c3fa3e61a50f54ab7ff80a163d29845be2d594894e9f5e2"

RPROVIDES:${PN} += "config-pinfo \
pinfo"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
