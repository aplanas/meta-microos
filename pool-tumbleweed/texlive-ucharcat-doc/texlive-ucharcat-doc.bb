SUMMARY = "Documentation for texlive-ucharcat"
DESCRIPTION = "This package includes the documentation for texlive-ucharcat"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn38907"

RPM_NAME = "texlive-ucharcat-doc-2023.209.0.0.03svn38907-54.1.noarch.rpm"
RPM_HASH = "b5772573aa67947d70ce9b197cc1c8948c0a53939648640ef9e56d7efb2baac1d0bde9a3e08a7567636b3089f569680735e7bcf526471d9dc505fd256e60dc5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucharcat-doc"

RDEPENDS:${PN} += ""

inherit rpm
