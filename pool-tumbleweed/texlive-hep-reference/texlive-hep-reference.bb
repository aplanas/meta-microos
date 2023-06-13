SUMMARY = "Adjustments for publications in High Energy Physics"
DESCRIPTION = "This package makes some changes to the reference, citation and \
footnote macros to improve the default behavior of LaTeX for \
High Energy Physics publications."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64853"

RPM_NAME = "texlive-hep-reference-2023.201.1.1svn64853-53.1.noarch.rpm"
RPM_HASH = "e7c249f10ddebc31eafd4221c0c9db763dfa5da6f8220706589c536d42357abe808009526fc9aea63e58adc37e23dbc2ae1f0abd3fa37d2e0033efe855448981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hep-reference.sty) \
texlive-hep-reference"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(cleveref.sty) \
tex(footnotebackref.sty) \
tex(hyperref.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
