SUMMARY = "Documentation for texlive-advdate"
DESCRIPTION = "This package includes the documentation for texlive-advdate"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20538"

RPM_NAME = "texlive-advdate-doc-2023.209.svn20538-55.1.noarch.rpm"
RPM_HASH = "12219a74571e9aafdd7df1aa5901c19dc7ae5c28108f6ebcbd3360509d3593ca1d5b3adaeda77ac655efcf7c39109ac25e9c163821e79e5dff16e34f0f41c68c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-advdate-doc"

RDEPENDS:${PN} += ""

inherit rpm
