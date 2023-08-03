SUMMARY = "Documentation for texlive-egameps"
DESCRIPTION = "This package includes the documentation for texlive-egameps"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-egameps-doc-2023.209.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "f4fe452d7c67e2983bf49b7eae6e132033a06846f806fd30a67e8bcd3b25c7ee8ca50b63ba9077cc4ded66ef0434bf56dddb7b2444b1858390634dc1fd663c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-egameps-doc"

RDEPENDS:${PN} += ""

inherit rpm
