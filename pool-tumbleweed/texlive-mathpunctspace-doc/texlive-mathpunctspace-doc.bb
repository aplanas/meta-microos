SUMMARY = "Documentation for texlive-mathpunctspace"
DESCRIPTION = "This package includes the documentation for texlive-mathpunctspace"
LICENSE = "BSD-3-Clause"

PV = "2023.208.1.1svn46754"

RPM_NAME = "texlive-mathpunctspace-doc-2023.208.1.1svn46754-53.1.noarch.rpm"
RPM_HASH = "fa2b51f1669259fa9c80dc0010bafb7e8a4b31815cf6b7d98f8e56ca43b3fa2c0fba6dc517200c513b40d4009aa873e2235336eca7e4b1ab896fea3c65c937a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathpunctspace-doc"

RDEPENDS:${PN} += ""

inherit rpm
