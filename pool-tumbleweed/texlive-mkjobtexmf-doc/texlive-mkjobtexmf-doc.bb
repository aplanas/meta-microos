SUMMARY = "Documentation for texlive-mkjobtexmf"
DESCRIPTION = "This package includes the documentation for texlive-mkjobtexmf"
LICENSE = "Artistic-1.0"

PV = "2023.201.0.0.8svn29725"

RPM_NAME = "texlive-mkjobtexmf-doc-2023.201.0.0.8svn29725-54.1.noarch.rpm"
RPM_HASH = "89dd9235c116ac2eccfe382baf8c8e965f55462df1b3f72e283c4a28bda3cfdc817a1bbe42b51ad5eee09759104c905aeff47b5d4adc4b7ce62938e9ab5677cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-mkjobtexmf.1 \
texlive-mkjobtexmf-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
