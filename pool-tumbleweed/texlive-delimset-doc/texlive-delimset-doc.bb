SUMMARY = "Documentation for texlive-delimset"
DESCRIPTION = "This package includes the documentation for texlive-delimset"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49544"

RPM_NAME = "texlive-delimset-doc-2023.209.1.1svn49544-53.1.noarch.rpm"
RPM_HASH = "ec72ff063a89823f94bf1084937c63ec1a5a687b46cc5f4ef6a1dd1c41846d41a4c55d57dd53620da2603722312cb8bc4e9377ecd6cca243d344d285f2dc704b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delimset-doc"

RDEPENDS:${PN} += ""

inherit rpm
