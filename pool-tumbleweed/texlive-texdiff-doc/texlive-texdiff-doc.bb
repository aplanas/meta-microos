SUMMARY = "Documentation for texlive-texdiff"
DESCRIPTION = "This package includes the documentation for texlive-texdiff"
LICENSE = "Artistic-1.0"

PV = "2023.209.0.0.4svn29752"

RPM_NAME = "texlive-texdiff-doc-2023.209.0.0.4svn29752-55.1.noarch.rpm"
RPM_HASH = "20992211c934407a2e2df9ed38e3d48b8e710b7d96c541890582a1c94734ce7e95e0401fc24cde72dc7101db8cdde51d02af521bcfdf6305c91cc57a9f4cd527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texdiff.1 \
texlive-texdiff-doc"

RDEPENDS:${PN} += ""

inherit rpm
