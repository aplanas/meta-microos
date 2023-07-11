SUMMARY = "Documentation for GLADE User Interface Builder"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment. \
 \
This package contains the documentation for Glade."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "glade-docs-3.40.0-2.4.noarch.rpm"
RPM_HASH = "54649e7f7a0528fc1474dc76a2a505cd9a1da63568fc76738101af5006b53d9c5ad59b1f6d717bc3283a911d6622d05baf2a71c424889bce9767319d22355bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glade-docs"

RDEPENDS:${PN} += ""

inherit rpm
