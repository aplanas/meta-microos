SUMMARY = "Documentation for texlive-librecaslon"
DESCRIPTION = "This package includes the documentation for texlive-librecaslon"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64432"

RPM_NAME = "texlive-librecaslon-doc-2023.201.svn64432-54.1.noarch.rpm"
RPM_HASH = "826b2f0bde7561605b8a49b98ce4e1d3bec31ae2eee46231f80dd9bc5b046db1c69fb4ab69cfd4759329ff4810a86b71b4179fb63278ecd4d0283d3aff033808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librecaslon-doc"
RDEPENDS:${PN} += ""

inherit rpm
