SUMMARY = "Documentation for texlive-ftnxtra"
DESCRIPTION = "This package includes the documentation for texlive-ftnxtra"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29652"

RPM_NAME = "texlive-ftnxtra-doc-2023.209.0.0.1svn29652-53.1.noarch.rpm"
RPM_HASH = "5e642faf7a4e2729f4aef4055a0c25a3ec70cb115cea848405ec65c70787fc235e0f6ee37921e9f0dc50dc88d1cb07aa65abe46e64d0efdd82721237655dbbc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ftnxtra-doc"

RDEPENDS:${PN} += ""

inherit rpm
