SUMMARY = "Image viewer widget for Gtk3"
DESCRIPTION = "The Gtk3::ImageView widget allows the user to zoom, pan and select the \
specified image and provides hooks to allow additional tools, e.g. painter, \
to be created and used. \
 \
Gtk3::ImageView is a Gtk3 port of Gtk2::ImageView. \
 \
To discuss Gtk3::ImageView or gtk3-perl, ask questions and flame/praise the \
authors, join gtk-perl-list@gnome.org at lists.gnome.org."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "10"

RPM_NAME = "perl-Gtk3-ImageView-10-1.9.noarch.rpm"
RPM_HASH = "f2ae61405033fd33369769814596617a4bee595018c48116b1aa979b513bb81c4dfb6df5bdbf310a7c1c316d714a371ff1767285222efafc807a408f875c665a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Gtk3--ImageView \
perl-Gtk3--ImageView--Tool \
perl-Gtk3--ImageView--Tool--Dragger \
perl-Gtk3--ImageView--Tool--Selector \
perl-Gtk3--ImageView--Tool--SelectorDragger \
perl-Gtk3-ImageView"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Cairo \
perl-Glib \
perl-Glib--Object--Subclass \
perl-Gtk3 \
perl-Readonly \
perl-feature"

inherit rpm
