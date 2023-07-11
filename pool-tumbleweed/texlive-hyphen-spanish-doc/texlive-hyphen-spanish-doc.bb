SUMMARY = "Documentation for texlive-hyphen-spanish"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-spanish"
LICENSE = "LPPL-1.0"

PV = "2023.208.5.0svn58652"

RPM_NAME = "texlive-hyphen-spanish-doc-2023.208.5.0svn58652-53.1.noarch.rpm"
RPM_HASH = "6ae1a63192fae21c5b152222c8ed77c672a20fbd219f1f689a4627dd3dcbe06aa7e024c1de679990b559280463a51f67d399f7af2c9ebaa82982b76501a5c582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hyphen-spanish-doc-es \
texlive-hyphen-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
