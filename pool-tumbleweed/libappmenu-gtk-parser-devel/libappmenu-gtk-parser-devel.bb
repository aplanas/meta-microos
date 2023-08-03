SUMMARY = "Common development-files for libappmenu-gtk{2,3}-parser"
DESCRIPTION = "This package contains common headers and documentation for \
libappmenu-gtk{2,3}-parser."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "libappmenu-gtk-parser-devel-0.7.6-2.1.noarch.rpm"
RPM_HASH = "6f69a348108c2bf00a8ebf6f5b0506991b7f66c7944345d8a5508511c9c26bf75526176a3af640703031827ee407e994c5a820c0c68ecac5fe6386c7bfe55591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libappmenu-gtk-parser-devel"

RDEPENDS:${PN} += ""

inherit rpm
