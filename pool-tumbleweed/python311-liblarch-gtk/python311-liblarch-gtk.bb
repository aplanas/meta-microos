SUMMARY = "GTK bindings for liblarch"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents) \
 \
This package provides GTK bindings for liblarch."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python311-liblarch-gtk-3.0-2.17.noarch.rpm"
RPM_HASH = "d83a4d3a4bf2fd18f669de460d5644cbfb8a076410debd9b16a4e14b3fbcc677580b8d07700fb099a95f25a6ce4d1aa64314428a26d7892d77a90ebe4eda23b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-liblarch-gtk \
python311-liblarch-gtk"

RDEPENDS:${PN} += "python-abi \
python311-gobject \
python311-liblarch \
typelib-Gtk"

inherit rpm
