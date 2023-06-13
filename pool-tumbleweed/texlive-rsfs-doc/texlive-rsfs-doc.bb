SUMMARY = "Documentation for texlive-rsfs"
DESCRIPTION = "This package includes the documentation for texlive-rsfs"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-rsfs-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "4fa1425bee724798efe215ce07310c4235d522c378e394474f3e5a864d51b266df97d5c59e026a05bed9df44be6082e933d5a06cd91319866305a37281ddeaee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rsfs-doc"

RDEPENDS:${PN} += ""

inherit rpm
