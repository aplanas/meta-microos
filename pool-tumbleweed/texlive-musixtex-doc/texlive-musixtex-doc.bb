SUMMARY = "Documentation for texlive-musixtex"
DESCRIPTION = "This package includes the documentation for texlive-musixtex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.36svn65519"

RPM_NAME = "texlive-musixtex-doc-2023.201.1.36svn65519-54.1.noarch.rpm"
RPM_HASH = "c0b017494045fdc0032488ea9ffa84e5ebba5ef970bf9defc603575ac9206410307cfbaff0b2bfaeb16c111428cfdb46a78447dfacdfde53e6af8a468c11cde7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(musixflx.1) \
man(musixtex.1) \
texlive-musixtex-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
