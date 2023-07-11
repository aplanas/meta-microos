SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.5"

RPM_NAME = "gtksourceview2-devel-2.10.5-20.10.aarch64.rpm"
RPM_HASH = "5db6e35475b1e8f35edcc74ee59add5cb9a5eb7526d968c15b95079f384d1a31c72eb29eb412f1632782cfbc379226bcf0730b502ec4e946b90535e49ff7e003"

RPROVIDES:${PN} += "gtksourceview-doc \
gtksourceview2-devel \
pkgconfig-gtksourceview-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-devel \
libgtksourceview-2-0-0 \
libxml2-devel \
pkgconfig-gtk+-2.0 \
pkgconfig-libxml-2.0"

inherit rpm
