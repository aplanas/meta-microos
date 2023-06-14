SUMMARY = "A gaphical application for generating images from LaTeX equations"
DESCRIPTION = "KLatexFormula is a graphical user interface for generating images \
from LaTeX equations. These images can be dragged and dropped or copied and \
pasted into external applications (presentations, text documents, graphics...), \
or can be saved to disk in a variety of formats (PNG, JPG, BMP, EPS, PDF, etc.). \
 \
If the 'cm-unicode' LaTeX package is installed, KLatexFormula can use LaTeX's \
Computer Modern Sans Serif font as a default application font."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "klatexformula-4.1.0-1.13.aarch64.rpm"
RPM_HASH = "db11fdbf8959b072576d31da25ac7f72aed5f47d3def986a0bc116acd9c675530b307a7c4131c7f60b3c7795bbe7a13be70b4dbc267125ae94fbf5e6a5233a38"

RPROVIDES:${PN} += "KLatexFormula \
klatexformula \
klatexformula-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libklfbackend.so.4 \
libklfbackend4 \
libklftools.so.4 \
libklftools4 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
