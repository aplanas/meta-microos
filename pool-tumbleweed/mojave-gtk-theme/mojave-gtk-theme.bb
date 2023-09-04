SUMMARY = "MacOS Mojave like theme for GTK 3, Gnome-Shell and others"
DESCRIPTION = "MacOS Mojave like theme for GTK 3, GTK 2 and Gnome-Shell which supports GTK 3 \
and GTK 2 based desktop environments like Gnome, Pantheon, XFCE, Mate, etc."
LICENSE = "GPL-3.0-only"

PV = "20230804"

RPM_NAME = "mojave-gtk-theme-20230804-1.1.noarch.rpm"
RPM_HASH = "a63505d89ae6b358071149ceb34c1719f8fd332afa580e6a98aab3de188b11ae505093029b2a6ad375766745bd1cdeb95d106cc498e923be12830bd55e3629de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojave-gtk-theme"

RDEPENDS:${PN} += ""

inherit rpm
