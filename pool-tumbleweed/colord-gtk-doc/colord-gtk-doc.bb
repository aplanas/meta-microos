SUMMARY = "Development Documentation for colord-gtk"
DESCRIPTION = "This package contains development documentation for the colord-gtk packages."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "colord-gtk-doc-0.3.0-1.4.noarch.rpm"
RPM_HASH = "ea0547501adffb63ccf52458bf8e43bfed957bb5aa1226b841e7fd277affdc039999b9f5223588e1ade0df2ef357bc787212c919e88507f31d423f8a85dcb686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-gtk-doc"
RDEPENDS:${PN} += ""

inherit rpm
