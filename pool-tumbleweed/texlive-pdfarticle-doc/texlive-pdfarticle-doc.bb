SUMMARY = "Documentation for texlive-pdfarticle"
DESCRIPTION = "This package includes the documentation for texlive-pdfarticle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51127"

RPM_NAME = "texlive-pdfarticle-doc-2023.209.1.0svn51127-52.1.noarch.rpm"
RPM_HASH = "6b130e9661da94e2bf1a40790dc666864849b55f02652909ae0c10faf4b5d3c8c464e9db3ee96ffd52710e60832e27dd659955700458c3db48b87da9dff3d594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
