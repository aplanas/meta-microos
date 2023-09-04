SUMMARY = "Documentation for texlive-ecclesiastic"
DESCRIPTION = "This package includes the documentation for texlive-ecclesiastic"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn38172"

RPM_NAME = "texlive-ecclesiastic-doc-2023.209.0.0.3svn38172-54.2.noarch.rpm"
RPM_HASH = "bc7743b59d259ff093e68960dfc770dc9aa63b546a4f758d4baee4e29266c520e064677e5777bfe847d9c4da81a161b02156815cb567f2355f5c7360db2d0424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecclesiastic-doc"

RDEPENDS:${PN} += ""

inherit rpm
