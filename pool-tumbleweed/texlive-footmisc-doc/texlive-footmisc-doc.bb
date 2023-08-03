SUMMARY = "Documentation for texlive-footmisc"
DESCRIPTION = "This package includes the documentation for texlive-footmisc"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.0dsvn62524"

RPM_NAME = "texlive-footmisc-doc-2023.209.6.0dsvn62524-53.1.noarch.rpm"
RPM_HASH = "9b69fe874079a309a50cb55f7e7a56b23f5f146bda8c72577426d2109942d8a5352109d02ed9dfcf8482f2e7ff6af6c4c24b7f7a9b71b43a21fd7c330f0cfb21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footmisc-doc"

RDEPENDS:${PN} += ""

inherit rpm
