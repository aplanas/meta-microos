SUMMARY = "Documentation for texlive-mkjobtexmf"
DESCRIPTION = "This package includes the documentation for texlive-mkjobtexmf"
LICENSE = "Artistic-1.0"

PV = "2023.209.0.0.8svn29725"

RPM_NAME = "texlive-mkjobtexmf-doc-2023.209.0.0.8svn29725-55.1.noarch.rpm"
RPM_HASH = "039ec19faf317cb43673afd74a6f1e724437ffdf1e761e65f88ddc04102a23bf2136917266f2f6a389ed918a29d947b05a6055d925ef5b15a8cf1bb81e317a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mkjobtexmf.1 \
texlive-mkjobtexmf-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
