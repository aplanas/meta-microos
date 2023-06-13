SUMMARY = "Wofi frontend for pass"
DESCRIPTION = "This script uses wofi and wtype to provide a completely \
Wayland-native way to conveniently use pass (from \
password-storage package). It provides the same search that \
passmenu does, but shows a second dialogue that lets the user \
choose which field to copy/print."
LICENSE = "GPL-2.0-only"

PV = "0.0~git.1684513404.072991c"

RPM_NAME = "wofi-pass-0.0~git.1684513404.072991c-1.1.noarch.rpm"
RPM_HASH = "484b7cc26c354353f8b5c9b19b5d93b1f7bbf71a9144451d8e07f524ddf9e930c36f77f32890e8743084fd3a99907cfbc0fd94ffd0ad35ec086ed60e63b6b4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wofi-pass"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
