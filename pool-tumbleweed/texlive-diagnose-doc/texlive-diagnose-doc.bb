SUMMARY = "Documentation for texlive-diagnose"
DESCRIPTION = "This package includes the documentation for texlive-diagnose"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn19387"

RPM_NAME = "texlive-diagnose-doc-2023.209.0.0.2svn19387-53.1.noarch.rpm"
RPM_HASH = "bb1cf39c1e4be1e1c10dca456d8cb72b4ce6c8998e95280af2d0182558fb51cb7464354ca698514123124910f0fe05df15d5edf94e9cebad491797d25bfa9bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diagnose-doc"

RDEPENDS:${PN} += ""

inherit rpm
