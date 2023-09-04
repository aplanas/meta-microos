SUMMARY = "Documentation for texlive-zref"
DESCRIPTION = "This package includes the documentation for texlive-zref"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.34svn62977"

RPM_NAME = "texlive-zref-doc-2023.209.2.34svn62977-53.2.noarch.rpm"
RPM_HASH = "027eca7de6277bd47583d9d41fc09eec8979b969ef5a25cecfa60e62db803ff42b4c7b9f24f4b0a29f68c78493a705078a91f12ed0747aecdbf6ed8a1d804c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-doc"

RDEPENDS:${PN} += ""

inherit rpm
