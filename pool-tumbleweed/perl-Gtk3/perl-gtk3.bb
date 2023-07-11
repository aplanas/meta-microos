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

RPM_NAME = "perl-Gtk3-0.038-1.12.noarch.rpm"
RPM_HASH = "ddc7aae963ce4f5905b1d8949ddd22353a92200cfec946716181eb72b4f3aeef71b151e560fc55108efdbceed464aabacdb8795818a49064d1c25378be3ebb84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Gtk3 \
perl-Gtk3--Gdk--EventMask"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Cairo--GObject \
perl-Glib--Object--Introspection \
perl-Test--Simple"

inherit rpm
