SUMMARY = "Documentation for texlive-pst-tvz"
DESCRIPTION = "This package includes the documentation for texlive-pst-tvz"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn23451"

RPM_NAME = "texlive-pst-tvz-doc-2023.209.1.01svn23451-54.1.noarch.rpm"
RPM_HASH = "c4d3bb71180bf05d61041a5d13139ce9a5fc165773623afdd1e5397ce3315f179f81f43a9326b6f2878ed5097b29c37bd068e87bdebc71d943bbb0c68b6de868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-tvz-doc"

RDEPENDS:${PN} += ""

inherit rpm
