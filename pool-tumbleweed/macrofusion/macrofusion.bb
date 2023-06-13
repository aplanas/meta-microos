SUMMARY = "GUI to combine photos to get deeper DOF or HDR"
DESCRIPTION = "MacroFusion is a neat little GUI for great tool Enfuse \
(command line) It makes easy fusion few photos to one with great \
DOF (Depth of Field) or DR (Dynamic Range) \
It can be useful for enthusiasts of landscape or macro imagery. \
 \
MacroFusion is a fork of EnfuseGui of Chez Gholyo and has been \
rebranded to avoid conflict with another EnfuseGui (for MacOS)."
LICENSE = "GPL-3.0-only"

PV = "0.7.4"

RPM_NAME = "macrofusion-0.7.4-5.10.noarch.rpm"
RPM_HASH = "2a3eea723911d2a92d1c885fc55f562ad33ba36f33d15958e09debe13fadd411f69315af50c994f3951f6b080dde649761beef2e63917cbb4783dc211975fa19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(macrofusion.desktop) \
macrofusion \
mimehandler(application/x-mfusion) \
mimehandler(image/jpeg) \
mimehandler(image/tiff)"

RDEPENDS:${PN} += "/usr/bin/python3 \
enblend-enfuse \
hugin \
python3-Pillow \
python3-cairo \
python3-gobject-Gdk \
typelib(GExiv2) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gtk)"

inherit rpm
