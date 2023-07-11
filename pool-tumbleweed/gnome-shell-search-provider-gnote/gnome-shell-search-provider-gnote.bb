SUMMARY = "Note editor for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "It is the same note taking application, including most of the add-ins (more are \
to come). Synchronization support is being worked on. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from documents."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnome-shell-search-provider-gnote-44.0-1.2.noarch.rpm"
RPM_HASH = "806d6a67f3f1da660c3d763f7cbc45e2c4c16077d78bb04400c1c85b809eeebeaabca8b909e6ded8ec8e38873f39c110c81c9f036422977b4cd044757360bc83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnote"

RDEPENDS:${PN} += "gnome-shell \
gnote"

inherit rpm
