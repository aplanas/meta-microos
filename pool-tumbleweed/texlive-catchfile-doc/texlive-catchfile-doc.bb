SUMMARY = "Documentation for texlive-catchfile"
DESCRIPTION = "This package includes the documentation for texlive-catchfile"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn53084"

RPM_NAME = "texlive-catchfile-doc-2023.201.1.8svn53084-52.1.noarch.rpm"
RPM_HASH = "eba71ecf916bd6de3da4b5d71110c8a4c44dc60d9e0e21036dbabbd03e844834431cce490764168b59f7ca619ca37d310c944cd54e4a395d7c79ad2ef5b355bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catchfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
