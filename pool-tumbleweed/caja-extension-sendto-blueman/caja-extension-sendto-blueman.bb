SUMMARY = "A sendto integration for Caja"
DESCRIPTION = "This package add sendto integration for Caja."
LICENSE = "GPL-3.0-only"

PV = "2.3.5"

RPM_NAME = "caja-extension-sendto-blueman-2.3.5-1.4.noarch.rpm"
RPM_HASH = "3c4a09be0e5772ea09e937b4674c39a21acaaf080c691fb532c1ac8a6d7e368e22818478fbfa4afcb17d650a393340643e6ab0c8ebcd0dcb38341b5418bb06d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-sendto-blueman"

RDEPENDS:${PN} += "blueman \
typelib-Caja \
typelib-GObject \
typelib-Gio"

inherit rpm
