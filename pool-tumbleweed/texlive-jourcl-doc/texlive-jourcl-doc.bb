SUMMARY = "Documentation for texlive-jourcl"
DESCRIPTION = "This package includes the documentation for texlive-jourcl"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65290"

RPM_NAME = "texlive-jourcl-doc-2023.209.svn65290-56.1.noarch.rpm"
RPM_HASH = "aca0236983544a2334bace747332122790f280f16be4cc03fdd0a60bbd1561d3534ca15f2643d74285a467d4485d6c66a594fd85e69f9a5db5468fed5f3ca043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jourcl-doc"

RDEPENDS:${PN} += ""

inherit rpm
