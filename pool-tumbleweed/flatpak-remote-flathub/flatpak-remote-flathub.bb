SUMMARY = "Add Flathub repository to system flatpak"
DESCRIPTION = "Flathub is a widely used repository for Flatpak applications. This package \
adds the Flathub repository to the list of system flatpak remotes."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.4"

RPM_NAME = "flatpak-remote-flathub-1.14.4-1.3.noarch.rpm"
RPM_HASH = "f07148d66efe3b6d765b277f27a7148ad8b00acb30e33d37f6af413d3410cab3efb863b1e25e87a038e985fc8bf96afcf6557d12dd128877c1e090611cf34e86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flatpak-remote-flathub"

RDEPENDS:${PN} += "/usr/bin/sh \
flatpak \
sed"

inherit rpm
