SUMMARY = "A GTK eBook reader"
DESCRIPTION = "A GTK eBook viewer, built with GJS and Epub.js."
LICENSE = "GPL-3.0-only"

PV = "2.6.4"

RPM_NAME = "foliate-2.6.4-2.5.noarch.rpm"
RPM_HASH = "bb686d3350f96e15841a0052b2d1b397d89f1ad355d26fd5122c9b9c8c5f6027f0ba8bf71cfda0f7b185ad4c3c0db9ed83354290f3183d288ea15c91deb5c7be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "foliate"

RDEPENDS:${PN} += "gjs \
typelib-Gio \
typelib-Gspell \
typelib-Gtk \
typelib-Handy \
typelib-WebKit2"

inherit rpm
