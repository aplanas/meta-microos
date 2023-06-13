SUMMARY = "Documentation for texlive-arcs"
DESCRIPTION = "This package includes the documentation for texlive-arcs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn15878"

RPM_NAME = "texlive-arcs-doc-2023.201.1svn15878-54.1.noarch.rpm"
RPM_HASH = "5a8d2279b75aef0a2cff1d546fb2eb670743156e23fcdef0b93021123a007ac9c2a435ba4375232d3e9a4e3d852f1cf800968dd48c342fdc4e1ba9b0a2560691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arcs-doc"

RDEPENDS:${PN} += ""

inherit rpm
