SUMMARY = "GTK3 Spell Checker Interface Library -- Development Files"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.10"

RPM_NAME = "gtkspell3-devel-3.0.10-3.9.aarch64.rpm"
RPM_HASH = "837be9495061a6550b8378d84b258416c685f0839a8a5e38c5fa6a5834805b1b01c77c0cf2b15e673bcb8205961133b72f1f9442d34c730f7b037437f69b2307"

RPROVIDES:${PN} += "gtkspell3-devel \
pkgconfig-gtkspell3-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkspell3-3-0 \
pkgconfig-enchant-2 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-GtkSpell-3-0"

inherit rpm
