SUMMARY = "Documentation for texlive-adtrees"
DESCRIPTION = "This package includes the documentation for texlive-adtrees"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn51618"

RPM_NAME = "texlive-adtrees-doc-2023.201.1.1svn51618-54.1.noarch.rpm"
RPM_HASH = "79082d22f0dd5ceab9424f875ae02c21c8661069a116f53acff817ac2b063c75289cbb84a30dd5e1c0dc51567a964708c89a281646cd3bbf57109e367e1d71be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adtrees-doc"

RDEPENDS:${PN} += ""

inherit rpm
