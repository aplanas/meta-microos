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

RPM_NAME = "perl-Gtk3-ImageView-10-1.10.noarch.rpm"
RPM_HASH = "5da97d0bb840961268ba190bde240bd342d3f3958b78807e5f5351fe289100ad24bdaae180cbd214e0381adabc5d96e818b3ecaee381f4174aba0c1f5585bb80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Gtk3--ImageView \
perl-Gtk3--ImageView--Tool \
perl-Gtk3--ImageView--Tool--Dragger \
perl-Gtk3--ImageView--Tool--Selector \
perl-Gtk3--ImageView--Tool--SelectorDragger \
perl-Gtk3-ImageView"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Cairo \
perl-Glib \
perl-Glib--Object--Subclass \
perl-Gtk3 \
perl-Readonly \
perl-feature"

inherit rpm
