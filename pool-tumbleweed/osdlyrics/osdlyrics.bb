SUMMARY = "A third-party lyrics display program"
DESCRIPTION = "OSD Lyrics is a lyrics show compatible with various media players. It is not a \
plugin but a standalone program. OSD Lyrics shows lyrics on your desktop, in the \
style similar to KaraOK. It also provides another displaying style, in which \
lyrics scroll from bottom to top. OSD Lyrics can download lyrics from the \
network automatically."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.14"

RPM_NAME = "osdlyrics-0.5.14-1.1.aarch64.rpm"
RPM_HASH = "e7ff6098df22e38b6cf072b72bbdb5615a2cae2189aec7796c63fbe6343a600d01de45203b6af0f934facf76e3a3581ec7d0fe5fc9b269390bf9db55e4cbe01d"

RPROVIDES:${PN} += "osdlyrics"

RDEPENDS:${PN} += "/usr/bin/sh \
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
