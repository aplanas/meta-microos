SUMMARY = "Add Flathub repository to system flatpak"
DESCRIPTION = "Flathub is a widely used repository for Flatpak applications. This package \
adds the Flathub repository to the list of system flatpak remotes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "flatpak-remote-flathub-1.14.4-1.2.noarch.rpm"
RPM_HASH = "25ea3dc8cdb60bb5f3f734a76dd9020e80bece65f3f2cc23a9f0d90481a08b5fd10432b8d9cfe9bbcfe25ed33f618fad92ed862222ba2982a09a9184f962890e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flatpak-remote-flathub"
RDEPENDS:${PN} += "/bin/sh \
flatpak \
sed"

inherit rpm
