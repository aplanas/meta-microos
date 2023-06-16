SUMMARY = "User-friendly telnet client designed for BBS browsing"
DESCRIPTION = "An easy-to-use telnet client mainly targets BBS users. \
PCManX is a newly developed GPL'd version of PCMan, a full-featured famous BBS \
client formerly designed for MS Windows only. It aimed to be an easy-to-use yet \
full-featured telnet client facilitating BBS browsing with the ability to \
process double-byte characters."
LICENSE = "GPL-2.0+"

PV = "1.3"

RPM_NAME = "pcmanx-gtk2-1.3-1.30.aarch64.rpm"
RPM_HASH = "9916f7aaa23078fdfe213c4568a428a56b877350dcbb74b75797de62da4e863ac53372b08fff6f53f33e14e4cd5340af98ae1822834e15792482a4655be97efe"

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
