SUMMARY = "Documentation for texlive-is-bst"
DESCRIPTION = "This package includes the documentation for texlive-is-bst"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.03svn52623"

RPM_NAME = "texlive-is-bst-doc-2023.209.2.03svn52623-56.1.noarch.rpm"
RPM_HASH = "654f606b9369f0635a84b81da3e1803f5b2ea11569c9b8dfbc2d485ed3e2ec205678a1e7d6cf341c6e5bb8ec5e1b5f56879df692a221a5b9c3777234941c3c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-is-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
