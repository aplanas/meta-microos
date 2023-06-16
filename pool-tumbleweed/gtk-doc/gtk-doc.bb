SUMMARY = "GTK+ Documentation Generator"
DESCRIPTION = "Gtkdoc is a set of Python scripts that generates API reference \
documentation in e.g DocBook, HTML or PDF format.  It can extract \
documentation from source code comments in a manner similar to \
Java-doc.  It is used to generate the documentation for GLib, \
Gtk+, and GNOME."
LICENSE = "GPL-2.0-or-later"

PV = "1.33.2"

RPM_NAME = "gtk-doc-1.33.2-1.5.aarch64.rpm"
RPM_HASH = "439efadb108dcded226e483735418e9599258d10643db93db4107fcf4c7c121050c360c294d48dc2749c5f579484898c021609689697978205153b41a1d406fb"

RPROVIDES:${PN} += "gtk-doc \
gtkdoc \
pkgconfig-gtk-doc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
/usr/bin/sh \
docbook-4 \
docbook-xsl-stylesheets \
glib2-devel \
libxml2-tools \
python3-pygments \
xsltproc"

inherit rpm
