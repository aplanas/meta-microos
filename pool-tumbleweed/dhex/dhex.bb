SUMMARY = "Hexeditor with a Diff-mode for ncurses"
DESCRIPTION = "DHEX is just another Hexeditor with a Diff mode for ncurses. It makes \
heavy use of colors and is themeable."
LICENSE = "GPL-2.0-or-later"

PV = "0.69"

RPM_NAME = "dhex-0.69-1.18.aarch64.rpm"
RPM_HASH = "71b6c30cb3043b31c366ac40a2cb97ab457442bcf549e7659c24226b1a67ca5002c1bcc49407383fc51e961d2b9854690f567a9ebd2df40660a68d09d98b22bf"

RPROVIDES:${PN} += "dhex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
