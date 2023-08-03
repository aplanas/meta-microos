SUMMARY = "Documentation for texlive-dynkin-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-dynkin-diagrams"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1415926535897932svn58758"

RPM_NAME = "texlive-dynkin-diagrams-doc-2023.209.3.1415926535897932svn58758-54.1.noarch.rpm"
RPM_HASH = "d6a3ea5019ce94d91b79569c563ded6824fe9786a11c094951a1ebff6439871006be8fb453ac249a48782b85182ed37d18e99072bfe8f03e096cf679d7a82229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynkin-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm
