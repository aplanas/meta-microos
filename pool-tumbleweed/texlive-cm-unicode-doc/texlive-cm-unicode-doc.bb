SUMMARY = "Documentation for texlive-cm-unicode"
DESCRIPTION = "This package includes the documentation for texlive-cm-unicode"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.7.0svn58661"

RPM_NAME = "texlive-cm-unicode-doc-2023.209.0.0.7.0svn58661-54.1.noarch.rpm"
RPM_HASH = "356a69c0ba7da94c389d95ff1b1b0b2b54269826ccc4d8e6a4cdb71cdd635a16570cbea480907a52fa3dc96a11c169b5389c7999fc9d710ea7c5e237763e2a7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-unicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
