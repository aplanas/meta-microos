SUMMARY = "User-friendly telnet client designed for BBS browsing"
DESCRIPTION = "An easy-to-use telnet client mainly targets BBS users. \
PCManX is a newly developed GPL'd version of PCMan, a full-featured famous BBS \
client formerly designed for MS Windows only. It aimed to be an easy-to-use yet \
full-featured telnet client facilitating BBS browsing with the ability to \
process double-byte characters."
LICENSE = "GPL-2.0+"

PV = "1.3"

RPM_NAME = "pcmanx-gtk2-1.3-1.31.aarch64.rpm"
RPM_HASH = "4d7c5eb2a327668f4d9f86d36d7efb2466691984f79df684c5e3d407a15daf55a61d41d0df3d64cadf1474039e8a6e4c4da45bddddf725690571a649fd7d82d9"

RPROVIDES:${PN} += "pcmanx-gtk2"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libltdl.so.7 \
libnotify.so.4 \
libpango-1.0.so.0 \
libstdc++.so.6"

inherit rpm
