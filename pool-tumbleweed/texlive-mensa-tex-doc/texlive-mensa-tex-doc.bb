SUMMARY = "Documentation for texlive-mensa-tex"
DESCRIPTION = "This package includes the documentation for texlive-mensa-tex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45997"

RPM_NAME = "texlive-mensa-tex-doc-2023.201.svn45997-52.1.noarch.rpm"
RPM_HASH = "e93b666f70b12a63722a78a7295edfaa55c97d9b5623e5ea1beaebd99a8f44c88409dc1f6b7448dd1118b2eccce8e727798d9530c9edcee044a1dad30b49ff8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mensa-tex-doc"

RDEPENDS:${PN} += ""

inherit rpm
