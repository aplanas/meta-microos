SUMMARY = "Documentation for texlive-soton"
DESCRIPTION = "This package includes the documentation for texlive-soton"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn16215"

RPM_NAME = "texlive-soton-doc-2023.209.0.0.1svn16215-58.1.noarch.rpm"
RPM_HASH = "2ba437cb2458d093c1d7af68e1f5bc9a71beb1eb41c6333abb2e10bf645dd693ed825ae6048b82f32f175811667305f37935b63f1102987e772255d08046612e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soton-doc"

RDEPENDS:${PN} += ""

inherit rpm
