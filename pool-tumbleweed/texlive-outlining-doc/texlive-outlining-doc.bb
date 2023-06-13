SUMMARY = "Documentation for texlive-outlining"
DESCRIPTION = "This package includes the documentation for texlive-outlining"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn45601"

RPM_NAME = "texlive-outlining-doc-2023.201.0.0.1svn45601-54.1.noarch.rpm"
RPM_HASH = "a448f8ccd403f671d349ed37022ce23be96e1a55c97dd60b2d2e186f379b8a3f46b8df7927596c9139782498bc8069660c9ac10ed231279eb676c278dd2ed043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-outlining-doc"

RDEPENDS:${PN} += ""

inherit rpm
