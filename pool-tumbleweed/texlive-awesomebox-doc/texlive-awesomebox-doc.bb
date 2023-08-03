SUMMARY = "Documentation for texlive-awesomebox"
DESCRIPTION = "This package includes the documentation for texlive-awesomebox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn57349"

RPM_NAME = "texlive-awesomebox-doc-2023.209.0.0.6svn57349-54.1.noarch.rpm"
RPM_HASH = "7572127b07debb656df4f1d45300db3b6abc1ec6c15f349177185466040e57e70dad7587934de73d901290541402af2217cd661c2146f2d6d3ec32685461b928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-awesomebox-doc"

RDEPENDS:${PN} += ""

inherit rpm
