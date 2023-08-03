SUMMARY = "Check for errors in LaTeX documents"
DESCRIPTION = "The program reports typographic and other errors in LaTeX \
documents. Filters are also provided for checking the LaTeX \
parts of CWEB documents."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.7.8svn64797"

RPM_NAME = "texlive-chktex-2023.209.1.7.8svn64797-54.1.noarch.rpm"
RPM_HASH = "4677df0561d37b16c311e7e6d50db8c3c8a42f8d2405fc11c0ed45c3e5b60bab97aaed672d84c4255cfbb8eea86f8bb4f541c31ade6afdf9fc4fefae48f8c377"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chktex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-chktex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
