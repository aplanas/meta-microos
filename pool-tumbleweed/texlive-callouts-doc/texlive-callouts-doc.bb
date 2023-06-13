SUMMARY = "Documentation for texlive-callouts"
DESCRIPTION = "This package includes the documentation for texlive-callouts"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44899"

RPM_NAME = "texlive-callouts-doc-2023.201.svn44899-52.1.noarch.rpm"
RPM_HASH = "5381547018bc0d01cb231477c04ab821e54f812710f698c492b39329d7f49737b0ba392ac9ffc5e46ecc219861e2306c387db9b6e2e527cb18dea2b294c31e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-callouts-doc"

RDEPENDS:${PN} += ""

inherit rpm
