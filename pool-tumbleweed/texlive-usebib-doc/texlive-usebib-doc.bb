SUMMARY = "Documentation for texlive-usebib"
DESCRIPTION = "This package includes the documentation for texlive-usebib"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn25969"

RPM_NAME = "texlive-usebib-doc-2023.209.1.0asvn25969-54.1.noarch.rpm"
RPM_HASH = "e4b3b993b199b859a0df45de8096b3f2303c19ba39b3f15e7ce034293099369d824d5590eb96db5955dbb34464af64ed3affe50555058dbdef29d1776e511437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-usebib-doc"

RDEPENDS:${PN} += ""

inherit rpm
