SUMMARY = "Documentation for texlive-tensor"
DESCRIPTION = "This package includes the documentation for texlive-tensor"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-tensor-doc-2023.209.2.1svn15878-55.1.noarch.rpm"
RPM_HASH = "f397608341f1459982f3fb3bd6708e7e3d600812ec508021a043069f5cb503e1401e13b7e4235c747cd314c94b978aca4e7e74e1b4d3eec73b972f104fb67824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tensor-doc"

RDEPENDS:${PN} += ""

inherit rpm
