SUMMARY = "Documentation for libdbusmenu - GTK 2 and GTK 3"
DESCRIPTION = "This package contains the documentation for the dbusmenu-gtk2 and dbusmenu-gtk3 \
libraries."
LICENSE = "GPL-3.0-only & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "16.04.0"

RPM_NAME = "libdbusmenu-gtk2-doc-16.04.0-9.4.noarch.rpm"
RPM_HASH = "2fe87e2bcf7ac31cc8451f67d5380502d6602a01e09a096d7db7f21837e77118abcd8f03b239d6dcd3b64943371b6d6fa3a56bd33d7d3cfcf557cc25253d90ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libdbusmenu-gtk2-doc"

RDEPENDS:${PN} += ""

inherit rpm
