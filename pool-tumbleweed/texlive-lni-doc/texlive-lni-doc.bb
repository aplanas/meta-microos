SUMMARY = "Documentation for texlive-lni"
DESCRIPTION = "This package includes the documentation for texlive-lni"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn58061"

RPM_NAME = "texlive-lni-doc-2023.209.1.7svn58061-55.1.noarch.rpm"
RPM_HASH = "3fb6338002c36f6f27e7a1bccc59324bcfcad43f895913dd9e91939ba3017662c6eae366354f6903259dcc22c9129b9ceb43b0c6ede3791076bbf0c6a14f5e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lni-doc"

RDEPENDS:${PN} += ""

inherit rpm
