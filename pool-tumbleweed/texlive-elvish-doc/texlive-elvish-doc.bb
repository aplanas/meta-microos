SUMMARY = "Documentation for texlive-elvish"
DESCRIPTION = "This package includes the documentation for texlive-elvish"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-elvish-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "842cf5116a1579f17a7081ccea735077f70734043a983c2f5eef4491b1e72ee582406b087c56d9554397571b908e8b567e0f35153b11a30a595ed88cd5c4a191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elvish-doc"

RDEPENDS:${PN} += ""

inherit rpm
