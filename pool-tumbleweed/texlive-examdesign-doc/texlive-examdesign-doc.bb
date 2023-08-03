SUMMARY = "Documentation for texlive-examdesign"
DESCRIPTION = "This package includes the documentation for texlive-examdesign"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.101svn15878"

RPM_NAME = "texlive-examdesign-doc-2023.209.1.101svn15878-53.1.noarch.rpm"
RPM_HASH = "d1e7814ecf233d418cb70ecd74bdfced0372a90c9f098c24e439d5a9c22787de53484b4abec798960eda4a0362bdac9b4ad7315e03513a5ff914950466c41913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-examdesign-doc"

RDEPENDS:${PN} += ""

inherit rpm
