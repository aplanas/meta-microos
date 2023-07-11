SUMMARY = "GTK bindings for liblarch"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents) \
 \
This package provides GTK bindings for liblarch."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python39-liblarch-gtk-3.0-2.17.noarch.rpm"
RPM_HASH = "325b8264f70446743b89a9d9c2f6ae999f959d2329ca3b2d66f6498b2913bb8d07018bac0f777963a6724bb29f9743a61c4a00ec26e783095184bb19aa7602d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-liblarch-gtk"

RDEPENDS:${PN} += "python-abi \
python39-gobject \
python39-liblarch \
typelib-Gtk"

inherit rpm
