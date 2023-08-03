SUMMARY = "Note editor for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "It is the same note taking application, including most of the add-ins (more are \
to come). Synchronization support is being worked on. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from documents."
LICENSE = "GPL-3.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-shell-search-provider-gnote-44.1-1.1.noarch.rpm"
RPM_HASH = "f38d16950856806e38cb4b8294f3202194b730f260891dd37135182827141eb4638c2ac56746d89d6740a6a03d26349a29868e4f23057bde2dacb671037b6666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnote"

RDEPENDS:${PN} += "gnome-shell \
gnote"

inherit rpm
