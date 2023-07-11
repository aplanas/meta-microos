SUMMARY = "Documentation for texlive-gu"
DESCRIPTION = "This package includes the documentation for texlive-gu"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-gu-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "19adc88a4d92728798408a8c14a68432d068c3808f2a968554d5fd5deca0f558277a3f4f70b0408e46ff93701253b936a170669c71ea7fd933c6a41d4baf2719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gu-doc-de \
texlive-gu-doc"

RDEPENDS:${PN} += ""

inherit rpm
