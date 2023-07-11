SUMMARY = "Perl binding for GooCanvas2 widget using Glib::Object::Introspection"
DESCRIPTION = "GooCanvas2 is a new canvas widget for use with Gtk3 that uses the Cairo 2d \
library for drawing. This is a simple and basic implementation of this \
wonderful Canvas widget. \
 \
For more informations see \
https://wiki.gnome.org/action/show/Projects/GooCanvas \
 \
For instructions, how to use GooCanvas2, please study the API reference at \
https://developer.gnome.org/goocanvas/unstable/ for now. A perl-specific \
documentation will perhaps come in later versions. But applying the C \
documentation should be no problem."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.06"

RPM_NAME = "perl-GooCanvas2-0.06-1.15.noarch.rpm"
RPM_HASH = "5f60d3c54ea94628e1d40ac068d7bd393ec1f0bde391d62edbb76638522ee382dedc3e422f17c01a05ddeea0de4ad08d100452c385fa19f9817f530a75f87de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GooCanvas2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Gtk3"

inherit rpm
