SUMMARY = "Documentation for texlive-phfcc"
DESCRIPTION = "This package includes the documentation for texlive-phfcc"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn60731"

RPM_NAME = "texlive-phfcc-doc-2023.209.2.0svn60731-52.1.noarch.rpm"
RPM_HASH = "a620c415fb46a6dba69f5fc1d4a85fca4e2cb1faf0355918bf12603914cad0a87baa503bef402d021dd22228ec110a917546227d8d134ac8c3587422e33d6412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfcc-doc"

RDEPENDS:${PN} += ""

inherit rpm
