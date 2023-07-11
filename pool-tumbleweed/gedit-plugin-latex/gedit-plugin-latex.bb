SUMMARY = "GEdit Plugin for Editing LaTeX Documents"
DESCRIPTION = "This plugin turns the gedit editor into a productive environment for \
editing LaTeX documents and managing BibTeX bibliographies."
LICENSE = "GPL-3.0-or-later"

PV = "3.20.0"

RPM_NAME = "gedit-plugin-latex-3.20.0-4.17.aarch64.rpm"
RPM_HASH = "f0dce3993414b61d5a1d1d1428bbd2976761a639bf226ce281734095278a6dd9cdd2af6dfad101ee7ab190b1d85611ab61af87ca7abea33cd2163852f1ed547e"

RPROVIDES:${PN} += "gedit-latex \
gedit-plugin-latex"

RDEPENDS:${PN} += "dbus-1-python3 \
gedit \
gvfs \
python3-gobject-Gdk \
rubber"

inherit rpm
