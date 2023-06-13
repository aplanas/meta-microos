SUMMARY = "A GTK eBook reader"
DESCRIPTION = "A GTK eBook viewer, built with GJS and Epub.js."
LICENSE = "GPL-3.0-only"

PV = "2.6.4"

RPM_NAME = "foliate-2.6.4-2.5.noarch.rpm"
RPM_HASH = "bb686d3350f96e15841a0052b2d1b397d89f1ad355d26fd5122c9b9c8c5f6027f0ba8bf71cfda0f7b185ad4c3c0db9ed83354290f3183d288ea15c91deb5c7be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(com.github.johnfactotum.Foliate.desktop) \
foliate \
metainfo() \
metainfo(com.github.johnfactotum.Foliate.metainfo.xml) \
mimehandler(application/epub+zip) \
mimehandler(application/vnd.amazon.mobi8-ebook) \
mimehandler(application/vnd.comicbook+zip) \
mimehandler(application/vnd.comicbook-rar) \
mimehandler(application/x-cb7) \
mimehandler(application/x-cbt) \
mimehandler(application/x-fictionbook+xml) \
mimehandler(application/x-mobipocket-ebook) \
mimehandler(application/x-zip-compressed-fb2) \
mimehandler(x-scheme-handler/opds)"

RDEPENDS:${PN} += "gjs \
typelib(Gio) \
typelib(Gspell) \
typelib(Gtk) \
typelib(Handy) \
typelib(WebKit2)"

inherit rpm
