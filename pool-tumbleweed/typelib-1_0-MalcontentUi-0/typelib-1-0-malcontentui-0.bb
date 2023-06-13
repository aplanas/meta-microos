SUMMARY = "Introspection bindings for the malcontent UI library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "typelib-1_0-MalcontentUi-0-0.10.4-1.5.aarch64.rpm"
RPM_HASH = "627912b0833d499d1317de39641682747414bc34708a3987b1aac4439e0fe840625197befe9339cce6598bcb183387b3e6aca2714e546641b238ee40b8afefd4"

RPROVIDES:${PN} += "typelib(MalcontentUi) \
typelib-1_0-MalcontentUi-0 \
typelib-1_0-MalcontentUi-0(aarch-64)"

RDEPENDS:${PN} += "libmalcontent-ui-0.so.0()(64bit) \
typelib(AccountsService) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(Malcontent) \
typelib(Pango) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
