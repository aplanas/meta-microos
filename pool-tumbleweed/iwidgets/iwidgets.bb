SUMMARY = "Widget Extension for Tcl/Tk"
DESCRIPTION = "[incr Widgets] is an object-oriented mega-widget set that extends \
Tcl/Tk and is based on [incr Tcl] and [incr Tk].  This set of \
mega-widgets delivers many new, general purpose widgets like option \
menus, comboboxes, selection boxes, and various dialogs whose \
counterparts are found in Motif and Windows. Since [incr Widgets] is \
based on the [incr Tk] extension, the Tk framework of configuration \
options, widget commands, and default bindings is maintained.  In other \
words, each [incr Widgets] mega-widget seamlessly blends with the \
standard Tk widgets. They look, act, and feel like Tk widgets. In \
addition, all [incr Widgets] mega-widgets are object oriented and may \
themselves be extended, using either inheritance or composition."
LICENSE = "MIT"

PV = "4.1"

RPM_NAME = "iwidgets-4.1-5.16.noarch.rpm"
RPM_HASH = "7f26f7a62abdc2aaf25c17d4ed9c6e3fa7ef29022c3d675632b02d259a05e4b6ac7a2b73fb72df76b31eb8b21f079638fb00056c1981a32889242c7f22e8b73c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iwidgets"

RDEPENDS:${PN} += "itk"

inherit rpm
