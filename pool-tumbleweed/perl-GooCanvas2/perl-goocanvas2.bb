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

RPM_NAME = "perl-GooCanvas2-0.06-1.14.noarch.rpm"
RPM_HASH = "d1578c60992d95ee0f83a27cf6676192318eff730ee21f76990b364a772776c931997736dc0bd73dfa207ac619ec0c99844b6d4d08d548f04abefdeffab81c27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GooCanvas2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Gtk3"

inherit rpm
