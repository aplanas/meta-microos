SUMMARY = "Perl interface to the 3.x series of the gtk+ toolkit"
DESCRIPTION = "The 'Gtk3' module allows a Perl developer to use the gtk+ graphical user \
interface library. Find out more about gtk+ at http://www.gtk.org. \
 \
The gtk+ reference manual is also a handy companion when writing 'Gtk3' \
programs in Perl: http://developer.gnome.org/gtk3/stable/. The Perl \
bindings follow the C API very closely, and the C reference documentation \
should be considered the canonical source. The principles underlying the \
mapping from C to Perl are explained in the documentation of \
Glib::Object::Introspection, on which 'Gtk3' is based. \
 \
Glib::Object::Introspection also comes with the 'perli11ndoc' program which \
displays the API reference documentation of all installed libraries \
organized in accordance with these principles."
LICENSE = "LGPL-2.1-or-later"

PV = "0.038"

RPM_NAME = "perl-Gtk3-0.038-1.11.noarch.rpm"
RPM_HASH = "f87fbb101904a70587a4cf0f1f257afa40b3ab934db6ab63ed023dfb8203c5dbd7eb02d0130fd9d354092a41c80d5030c0d70c9ab106684ba43af398f61be3fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Gtk3 \
perl-Gtk3--Gdk--EventMask"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Cairo--GObject \
perl-Glib--Object--Introspection \
perl-Test--Simple"

inherit rpm
