SUMMARY = "Documentation for texlive-pygmentex"
DESCRIPTION = "This package includes the documentation for texlive-pygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn64131"

RPM_NAME = "texlive-pygmentex-doc-2023.201.0.0.11svn64131-53.1.noarch.rpm"
RPM_HASH = "d5fedb5f750799171cde4b70e23b2b773a5fb724a51f5454f05187303c7cdecfc0d3837bdd61ebc7d318095955878a28f0ff691ff6dc1c144d9db4e23e9c89a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pygmentex-doc"

RDEPENDS:${PN} += ""

inherit rpm
