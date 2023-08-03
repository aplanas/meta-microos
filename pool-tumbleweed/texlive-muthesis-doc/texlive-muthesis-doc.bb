SUMMARY = "Documentation for texlive-muthesis"
DESCRIPTION = "This package includes the documentation for texlive-muthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23861"

RPM_NAME = "texlive-muthesis-doc-2023.209.svn23861-55.1.noarch.rpm"
RPM_HASH = "995e1e33e98f9b16085a1e1e1ad24cf9cd9120a0e66630c7eec199071500b7bfcddfcac83713bf4451722a41c7168cc4afa49dfcdb6de50163295bd832c942d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-muthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
