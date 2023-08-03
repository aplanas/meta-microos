SUMMARY = "Documentation for texlive-venn"
DESCRIPTION = "This package includes the documentation for texlive-venn"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-venn-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "9f2edba9205a95f10148f6093f1d04f71a64bb48671cd8c17ff7e91d0cc398ee88395065ad1b3566d7f3c2610e916eba590edcb53b581bf37b6ee8d1029b89a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venn-doc"

RDEPENDS:${PN} += ""

inherit rpm
