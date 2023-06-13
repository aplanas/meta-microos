SUMMARY = "Documentation for texlive-zootaxa-bst"
DESCRIPTION = "This package includes the documentation for texlive-zootaxa-bst"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn50619"

RPM_NAME = "texlive-zootaxa-bst-doc-2023.201.1.0svn50619-52.1.noarch.rpm"
RPM_HASH = "abedc7f47fe7ea41d7209965b34f6420350c29e65b51c3c8a79199a5ce892757a266519b3ac786a777afcaa558b3899fbe18d8f37d068b0f3933d8a116e99aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zootaxa-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
