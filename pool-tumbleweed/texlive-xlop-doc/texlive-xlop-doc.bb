SUMMARY = "Documentation for texlive-xlop"
DESCRIPTION = "This package includes the documentation for texlive-xlop"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.28svn56910"

RPM_NAME = "texlive-xlop-doc-2023.201.0.0.28svn56910-52.2.noarch.rpm"
RPM_HASH = "79c79b4281ac2cd544acd163ef0a36d8431e2ae0e2dac9b295f6282c81f2ebf7277b587070d2e68a1e0749ba187bb4d1b184f2b87d117edae6db954bbde77e0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xlop-doc-fr;en \
texlive-xlop-doc"

RDEPENDS:${PN} += ""

inherit rpm
