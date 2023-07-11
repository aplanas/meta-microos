SUMMARY = "Documentation for texlive-pxtxalfa"
DESCRIPTION = "This package includes the documentation for texlive-pxtxalfa"
LICENSE = "LPPL-1.0"

PV = "2023.201.2svn60847"

RPM_NAME = "texlive-pxtxalfa-doc-2023.201.2svn60847-53.2.noarch.rpm"
RPM_HASH = "5b4790bf32e9135c3e843dbf52be50cdefef45d6da5bb4b0a6d0a233ef3180629fd6d3ecd8d6a588dec10f493349ee3b2b9011edfad846c472d1b6a811b7faff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxtxalfa-doc"

RDEPENDS:${PN} += ""

inherit rpm
