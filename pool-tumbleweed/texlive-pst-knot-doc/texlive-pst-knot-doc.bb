SUMMARY = "Documentation for texlive-pst-knot"
DESCRIPTION = "This package includes the documentation for texlive-pst-knot"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn16033"

RPM_NAME = "texlive-pst-knot-doc-2023.201.0.0.2svn16033-52.1.noarch.rpm"
RPM_HASH = "d498b97f7e3aad61af3b0906c5a0867579ef2e66a9facf8c42fabf6261cdce422e209e316022561b3e8ac566748f5c9abef2917a2471a63f411275b0d00b46a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-knot-doc"
RDEPENDS:${PN} += ""

inherit rpm
