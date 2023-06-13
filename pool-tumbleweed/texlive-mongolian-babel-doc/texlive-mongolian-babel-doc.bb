SUMMARY = "Documentation for texlive-mongolian-babel"
DESCRIPTION = "This package includes the documentation for texlive-mongolian-babel"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-mongolian-babel-doc-2023.201.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "84f020525a6a29a0d1cc619d2952259bb6664f7db65041733c5cf0c677cd263d3bb6e0235a26ecc31897a7d98d4829f8c740edb9eea7124045cfda8d3de5d1e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mongolian-babel-doc"

RDEPENDS:${PN} += ""

inherit rpm
