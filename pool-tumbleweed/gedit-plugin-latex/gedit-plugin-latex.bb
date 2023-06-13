SUMMARY = "GEdit Plugin for Editing LaTeX Documents"
DESCRIPTION = "This plugin turns the gedit editor into a productive environment for \
editing LaTeX documents and managing BibTeX bibliographies."
LICENSE = "GPL-3.0-or-later"

PV = "3.20.0"

RPM_NAME = "gedit-plugin-latex-3.20.0-4.16.aarch64.rpm"
RPM_HASH = "61e9bbe57b8b40df3a963b59a0b17fbfef9db862f664e75ec884fc9784077dee03623b02c08669853f16d799836f26fc437811b11f10197932cb8f73d3ac5084"

RPROVIDES:${PN} += "gedit-latex \
gedit-plugin-latex \
gedit-plugin-latex(aarch-64)"

RDEPENDS:${PN} += "dbus-1-python3 \
gedit \
gvfs \
python3-gobject-Gdk \
rubber"

inherit rpm
