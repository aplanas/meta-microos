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

RPM_NAME = "perl-GooCanvas2-0.06-1.16.noarch.rpm"
RPM_HASH = "3fa1f2c1dc42283a843ff8c49b00c21aa2befef0cdb7bcd1a1e5cbe68bb9e7ce789e0972bba27fcaf949badf5ae9e009dfb4ec69f4699d8a301d3e8f9b55b203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-GooCanvas2"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Gtk3"

inherit rpm
