SUMMARY = "Documentation for texlive-petri-nets"
DESCRIPTION = "This package includes the documentation for texlive-petri-nets"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn39165"

RPM_NAME = "texlive-petri-nets-doc-2023.201.svn39165-51.1.noarch.rpm"
RPM_HASH = "7dae8bcecb8343005653d8e5a039a734df636d235b940533746fda77bd0f5a851092130ff826f6e416b3d287d8a8bd35ca6ac78e733e23c2301165d72fa19c16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-petri-nets-doc"
RDEPENDS:${PN} += ""

inherit rpm
