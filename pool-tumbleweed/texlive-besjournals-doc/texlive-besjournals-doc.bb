SUMMARY = "Documentation for texlive-besjournals"
DESCRIPTION = "This package includes the documentation for texlive-besjournals"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45662"

RPM_NAME = "texlive-besjournals-doc-2023.209.svn45662-54.1.noarch.rpm"
RPM_HASH = "2af8a12b57a44aeafa41f3756627aa62f0645f4a89340a754c0b21bddbc1b6152667fcd1dc4c13c53e532c220b0c9b9d6d2971d173bd117a3d090cbe0178d080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-besjournals-doc"

RDEPENDS:${PN} += ""

inherit rpm
