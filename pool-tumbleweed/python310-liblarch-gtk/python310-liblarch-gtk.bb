SUMMARY = "GTK bindings for liblarch"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents) \
 \
This package provides GTK bindings for liblarch."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python310-liblarch-gtk-3.0-2.17.noarch.rpm"
RPM_HASH = "40a75a2cf139256bf96a7deb95bd108e48dbafcd6661432c06a803e8a6123459856f3d9fc777d6736bca30bd30d83a36a83f38c8d34cf3b3dd12a2d1027ef76f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-liblarch-gtk"

RDEPENDS:${PN} += "python-abi \
python310-gobject \
python310-liblarch \
typelib-Gtk"

inherit rpm
