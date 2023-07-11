SUMMARY = "MacOS Mojave like theme for GTK 3, Gnome-Shell and others"
DESCRIPTION = "MacOS Mojave like theme for GTK 3, GTK 2 and Gnome-Shell which supports GTK 3 \
and GTK 2 based desktop environments like Gnome, Pantheon, XFCE, Mate, etc."
LICENSE = "GPL-3.0-only"

PV = "20230613"

RPM_NAME = "mojave-gtk-theme-20230613-1.1.noarch.rpm"
RPM_HASH = "e59fd51ee135ba11d2bc5aeaebfe3a7717d17b9c9eae712753cb94f185c75099f33840c416edcddd4467d71dc2930ddc5a5aec34e2941d749823a9b0b99d6c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojave-gtk-theme"

RDEPENDS:${PN} += ""

inherit rpm
