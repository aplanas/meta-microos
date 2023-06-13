SUMMARY = "Documentation for the FOX Toolkit 1.6"
DESCRIPTION = "FOX is a C++-based library for graphical user interface development. \
 \
The doc subpackage contains the HTML documentation to the FOX toolkit 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-doc-1.6.57-4.1.noarch.rpm"
RPM_HASH = "39df441ce3eb9d36b6b5f3b1c2210868ddf7026fe53d8103a0e4511d44a207cdabf18045f14282c3c2ceeaa1f7f76dd27c45fc83c88b56b81ed3d145dadc47de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fox16-doc"

RDEPENDS:${PN} += ""

inherit rpm
