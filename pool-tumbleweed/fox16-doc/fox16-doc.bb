SUMMARY = "Documentation for the FOX Toolkit 1.6"
DESCRIPTION = "FOX is a C++-based library for graphical user interface development. \
 \
The doc subpackage contains the HTML documentation to the FOX toolkit 1.6."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-doc-1.6.57-4.2.noarch.rpm"
RPM_HASH = "a27f6b3318432627e5eee3c7f8222a7fd255052c7425540df386e2230f90b20113036f57decb9d7dc9c8c545cf58bd8025e66723bc03b8051a5139b28692cc63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fox16-doc"

RDEPENDS:${PN} += ""

inherit rpm
