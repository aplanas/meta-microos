SUMMARY = "'Five or More' Game for GNOME"
DESCRIPTION = "Five or More is a game where one must align colored pieces as the \
board gets filled with randomly placed pieces. When five or more \
pieces of the same color get lined up, they disappear. The game ends \
when the board gets filled up all the way. \
 \
This package provides the binary, manual and data files for Five or More."
LICENSE = "GPL-2.0-or-later"

PV = "3.32.3"

RPM_NAME = "five-or-more-3.32.3-1.7.aarch64.rpm"
RPM_HASH = "b46c519389eb1c922a229efe7f4c932c24bda5c668ed6b734ec4c6ae45297fd9a669a572f20d983c067bf8c18f4ca808b69f38c793a4795202b710b646309e87"

RPROVIDES:${PN} += "application() \
application(org.gnome.five-or-more.desktop) \
five-or-more \
five-or-more(aarch-64) \
metainfo() \
metainfo(org.gnome.five-or-more.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-games-support-1.so.3()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm
