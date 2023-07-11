SUMMARY = "Git repository viewer -- Python bindings"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "python3-GitgExt-41-2.10.aarch64.rpm"
RPM_HASH = "dc94f197da11600c3c9abf02c4b17dba74a2ed924438cf81fd961f86d72a09b25f37180117ca3d6d60142628f0b96372fabf79782c3f79c85634900d690e9c49"

RPROVIDES:${PN} += "python3-GitgExt"

RDEPENDS:${PN} += "python-abi \
typelib-GObject"

inherit rpm
