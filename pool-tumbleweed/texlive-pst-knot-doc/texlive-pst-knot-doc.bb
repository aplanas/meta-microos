SUMMARY = "Documentation for texlive-pst-knot"
DESCRIPTION = "This package includes the documentation for texlive-pst-knot"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn16033"

RPM_NAME = "texlive-pst-knot-doc-2023.209.0.0.2svn16033-53.1.noarch.rpm"
RPM_HASH = "1052203263bda5521aeaa0087113a2228932a51c0414df14b180c6e1d61c4e44a7fdb77ed07eb65e1d47fb623bc335ef921b89d7fe177d99fa03f6bb5537436f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-knot-doc"

RDEPENDS:${PN} += ""

inherit rpm
