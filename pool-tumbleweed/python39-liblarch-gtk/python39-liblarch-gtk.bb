SUMMARY = "GTK bindings for liblarch"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents) \
 \
This package provides GTK bindings for liblarch."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python39-liblarch-gtk-3.0-2.15.noarch.rpm"
RPM_HASH = "e942ddc35c4c9ddfaf9bebf5bed13b349b975067d859891fbc42e8c5b76eeb508409bcd433885b7d68f66cb55fddbf0415fed4ebfef18c55287a7c7370a82711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-liblarch-gtk"

RDEPENDS:${PN} += "python-abi \
python39-gobject \
python39-liblarch \
typelib-Gtk"

inherit rpm
