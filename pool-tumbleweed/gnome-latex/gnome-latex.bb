SUMMARY = "Integrated LaTeX Environment for the GNOME desktop"
DESCRIPTION = "Gnome-latex is an Integrated LaTeX Environment for GNOME. The main \
features are: \
  * Configurable buttons to compile, convert and view a document in \
    one click. \
  * LaTeX commands auto-completion. \
  * Symbol tables (Greek letters, arrows, ...). \
  * File browser integrated. \
  * Template managing. \
  * Menus with the most commonly used LaTeX commands. \
  * Easy projects management."
LICENSE = "GPL-3.0-or-later"

PV = "3.44.0"

RPM_NAME = "gnome-latex-3.44.0-1.4.aarch64.rpm"
RPM_HASH = "71e53c5b2f0b501f3e11726935c376a856191e9a83bfb0c606c170daa5890ffde9de49e421ff0565dfb441ed2ff74e158ce35c0bb35ce637c873a0a7bd43cee9"

RPROVIDES:${PN} += "gnome-latex \
latexila"

RDEPENDS:${PN} += "gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libamtk-5.so.0 \
libc.so.6 \
libdconf.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libpango-1.0.so.0 \
libtepl-6.so.2 \
texlive-latexmk-bin"

inherit rpm
