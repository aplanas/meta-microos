SUMMARY = "Development Documentation for colord-gtk"
DESCRIPTION = "This package contains development documentation for the colord-gtk packages."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.0"

RPM_NAME = "colord-gtk-doc-0.3.0-2.1.noarch.rpm"
RPM_HASH = "15eba4514b38ecd3646275b15fd7a41b60e5f6970eb8a881da2ccf241152bc9cb4e07294bda8f5ccca65262f9b0272bd40839d3229a3a3a98247dfbfe90c7510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-gtk-doc"

RDEPENDS:${PN} += ""

inherit rpm
