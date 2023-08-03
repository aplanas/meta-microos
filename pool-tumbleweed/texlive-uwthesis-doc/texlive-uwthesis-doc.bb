SUMMARY = "Documentation for texlive-uwthesis"
DESCRIPTION = "This package includes the documentation for texlive-uwthesis"
LICENSE = "Apache-1.0"

PV = "2023.209.6.13svn15878"

RPM_NAME = "texlive-uwthesis-doc-2023.209.6.13svn15878-54.1.noarch.rpm"
RPM_HASH = "3abbf3f0a33ac818ae2b318af8bda3b8d99f4b4b1f37917768df42bab6500f7c4e4abf6150b9521dfe920be91735a9dce2e2264ae88eb39c1d6ca10828d72f1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
