SUMMARY = "Documentation for texlive-biblatex-true-citepages-omit"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-true-citepages-omit"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn44653"

RPM_NAME = "texlive-biblatex-true-citepages-omit-doc-2023.209.2.0.0svn44653-54.1.noarch.rpm"
RPM_HASH = "e6331dcaa1ce18d196a5c1f45680767436bfa77d70dddb590c87e1aae2c6939918f00689555940bf22fea300a4ee5c6d2b62c39d07d0c44e7508c5af081adc49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-true-citepages-omit-doc"

RDEPENDS:${PN} += ""

inherit rpm
