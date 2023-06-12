SUMMARY = "Documentation for texlive-mdwtools"
DESCRIPTION = "This package includes the documentation for texlive-mdwtools"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.05.4svn15878"

RPM_NAME = "texlive-mdwtools-doc-2023.201.1.05.4svn15878-52.1.noarch.rpm"
RPM_HASH = "470ddc5da0cd313b818b36cbb326428bc9a9e28734da8b6218e44e09519bb74af2e8d32df3b9c7f034d8ba8e8dcbb904043d565714272201b765314934f07083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mdwtools-doc"
RDEPENDS:${PN} += ""

inherit rpm
