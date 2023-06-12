SUMMARY = "Translations for package clutter-gtk"
DESCRIPTION = "Provides translations for the 'clutter-gtk' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.4"

RPM_NAME = "clutter-gtk-lang-1.8.4-5.17.noarch.rpm"
RPM_HASH = "6c83f6e38641dbe0a7f4d533436d5532483547bdf4dcb9da4b93bd6000eee8b66a8b087e9c7fb43eef8478f6bb1d7554d22a2ab5c57abbd2ad2b617a8c5ae0b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clutter-gtk-lang \
clutter-gtk-lang-all \
locale(clutter-gtk:ja) \
locale(clutter-gtk:pl) \
locale(clutter-gtk:zh_CN)"
RDEPENDS:${PN} += "clutter-gtk"

inherit rpm
