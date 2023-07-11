SUMMARY = "Translations for package clutter-gtk"
DESCRIPTION = "Provides translations for the 'clutter-gtk' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.4"

RPM_NAME = "clutter-gtk-lang-1.8.4-5.18.noarch.rpm"
RPM_HASH = "ed8242b8b07aade9ad3a2a8f292df2002f826fb67330ec5a5e6e851d878be782b52a333d110a5b488ea2ff07c7097270db632be1477dd138d37d627e95978802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clutter-gtk-lang \
clutter-gtk-lang-all \
locale-clutter-gtk-ja \
locale-clutter-gtk-pl \
locale-clutter-gtk-zh-CN"

RDEPENDS:${PN} += "clutter-gtk"

inherit rpm
