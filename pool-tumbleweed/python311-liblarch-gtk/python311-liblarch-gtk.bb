SUMMARY = "GTK bindings for liblarch"
DESCRIPTION = "Liblarch is a Python library built to handle data structure such \
are lists, trees and acyclic graphs (tree where nodes can have multiple \
parents) \
 \
This package provides GTK bindings for liblarch."
LICENSE = "LGPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "python311-liblarch-gtk-3.0-2.15.noarch.rpm"
RPM_HASH = "816267d3cadaed30ce1b2cdc1da0b0ee280a5434da256deb6b8f662e13192be949eced99f1bdcf499a37b40c91d5143be961811bc21e696337bdbaf25406d283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-liblarch-gtk"

RDEPENDS:${PN} += "python(abi) \
python311-gobject \
python311-liblarch \
typelib(Gtk)"

inherit rpm
