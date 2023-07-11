SUMMARY = "Documentation for texlive-xmltex"
DESCRIPTION = "This package includes the documentation for texlive-xmltex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn62145"

RPM_NAME = "texlive-xmltex-doc-2023.201.0.0.8svn62145-52.2.noarch.rpm"
RPM_HASH = "a7536768607bbfa512b2cddf61a0f8598b4e813c88b4ac716e4ef5dd7e77658ea4a44f70a2e72bd56848a055e80dda95c519bc8e4b33d9cd5eb2f9f87bfecce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
