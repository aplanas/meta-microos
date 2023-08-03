SUMMARY = "Documentation for texlive-erdc"
DESCRIPTION = "This package includes the documentation for texlive-erdc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-erdc-doc-2023.209.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "59ac2c3af2bf92d762f627db77974b7d4ee45fd51e64a68583c4510606cc482c3b527134dd69ef763e9966905418c6ab29224ec66e005b2183171b2c84e28a7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erdc-doc"

RDEPENDS:${PN} += ""

inherit rpm
