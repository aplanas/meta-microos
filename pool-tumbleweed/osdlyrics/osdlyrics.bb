SUMMARY = "A third-party lyrics display program"
DESCRIPTION = "OSD Lyrics is a lyrics show compatible with various media players. It is not a \
plugin but a standalone program. OSD Lyrics shows lyrics on your desktop, in the \
style similar to KaraOK. It also provides another displaying style, in which \
lyrics scroll from bottom to top. OSD Lyrics can download lyrics from the \
network automatically."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.13"

RPM_NAME = "osdlyrics-0.5.13-1.3.aarch64.rpm"
RPM_HASH = "295305fe7df568320c9e63af27055f99edb7d8ac5401756794c9226772cb27e576656fcdc0565779edff5b626fbc858b601da866ccd38cb2408fe87180415090"

RPROVIDES:${PN} += "osdlyrics"

RDEPENDS:${PN} += "/bin/sh \
gtk2 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libappindicator.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbus-glib-1.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
python3-chardet \
python3-future \
python3-pycurl \
sqlite3"

inherit rpm
