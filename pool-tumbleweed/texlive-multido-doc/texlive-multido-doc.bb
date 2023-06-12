SUMMARY = "Documentation for texlive-multido"
DESCRIPTION = "This package includes the documentation for texlive-multido"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.42svn18302"

RPM_NAME = "texlive-multido-doc-2023.201.1.42svn18302-54.1.noarch.rpm"
RPM_HASH = "79d3407bc7c8093abfe45a1fd6fabc91ab519dca353b44206438dcdb591a7e2ae9baa100a308a8b55765c952b442921482ce0ce9514490cf30f843b988670071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multido-doc"
RDEPENDS:${PN} += ""

inherit rpm
