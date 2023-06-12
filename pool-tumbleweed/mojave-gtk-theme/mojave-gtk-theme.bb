SUMMARY = "MacOS Mojave like theme for GTK 3, Gnome-Shell and others"
DESCRIPTION = "MacOS Mojave like theme for GTK 3, GTK 2 and Gnome-Shell which supports GTK 3 \
and GTK 2 based desktop environments like Gnome, Pantheon, XFCE, Mate, etc."
LICENSE = "GPL-3.0-only"

PV = "20221021"

RPM_NAME = "mojave-gtk-theme-20221021-1.2.noarch.rpm"
RPM_HASH = "4b80ced3e47cdb9e97409fb164cd96ab540342cf295cb382e5c2f4a34f9ebab655d5c04ed8839bf5ef18f2a45326e068b3cdd2118e922b6bd46a8919836de2f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojave-gtk-theme"
RDEPENDS:${PN} += ""

inherit rpm
