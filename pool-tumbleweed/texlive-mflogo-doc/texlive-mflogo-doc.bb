SUMMARY = "Documentation for texlive-mflogo"
DESCRIPTION = "This package includes the documentation for texlive-mflogo"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn42428"

RPM_NAME = "texlive-mflogo-doc-2023.209.2.0svn42428-55.1.noarch.rpm"
RPM_HASH = "bcf818d99de960c470b6000eb68f9098e8fcbada644d55b9495a64dfd1c18b3fcdaf842500f97a90c45a0624ddd1f46b92aff0916048a3e3288b9b2ff754c2c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mflogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
