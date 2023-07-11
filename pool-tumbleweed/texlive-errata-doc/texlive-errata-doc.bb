SUMMARY = "Documentation for texlive-errata"
DESCRIPTION = "This package includes the documentation for texlive-errata"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn42428"

RPM_NAME = "texlive-errata-doc-2023.201.0.0.3svn42428-53.2.noarch.rpm"
RPM_HASH = "2a7e39e4bf30f1591a6c4ee3653b1ab7bf23f49bad8cb592869ca0261acec062c94745afe021f94f0e09ffd196ed38a3e2447c8effd380f71d2a2bd2bc750e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-errata-doc"

RDEPENDS:${PN} += ""

inherit rpm
