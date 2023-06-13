SUMMARY = "Documentation for GLADE User Interface Builder"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment. \
 \
This package contains the documentation for Glade."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "glade-docs-3.40.0-2.3.noarch.rpm"
RPM_HASH = "41c86c540981f23784a0e3618942c57ad5a5a94d95a671bed0c37a78f635cb3daa29e649c70a7a13f727ea2466cee6671935fbfa7a0ba6345f9cf993e2a0ed70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glade-docs"

RDEPENDS:${PN} += ""

inherit rpm
