SUMMARY = "Documentation for texlive-babel-swedish"
DESCRIPTION = "This package includes the documentation for texlive-babel-swedish"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3esvn57647"

RPM_NAME = "texlive-babel-swedish-doc-2023.201.2.3esvn57647-53.1.noarch.rpm"
RPM_HASH = "b85a377536695a59db35658d8e1af5386b645f22938decdbb610cf889eabd195cc0cc85ac548bca487f12907f34ac90a4839d65c9c388d364d2c6b7e8fbf7ab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-swedish-doc"

RDEPENDS:${PN} += ""

inherit rpm
