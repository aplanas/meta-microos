SUMMARY = "Git repository viewer -- Python bindings"
DESCRIPTION = "gitg is a GitX clone for GNOME/gtk+. It aims at being a small, fast and \
convenient tool to visualize git history and actions that benefit from a \
graphical presentation."
LICENSE = "GPL-2.0-or-later"

PV = "41"

RPM_NAME = "python3-GitgExt-41-2.8.aarch64.rpm"
RPM_HASH = "c14a5a1edbff8c223fa31413761a4925b7bcf19e840f8f9ae4e4f6582bcea7704276ff53e451a4e6f3332c55543cbbd36fc941e23e72163dd303ae3ec0919d26"

RPROVIDES:${PN} += "python3-GitgExt"

RDEPENDS:${PN} += "python-abi \
typelib-GObject"

inherit rpm
