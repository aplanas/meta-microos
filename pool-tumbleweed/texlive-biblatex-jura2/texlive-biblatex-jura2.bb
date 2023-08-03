SUMMARY = "Citation style for the German legal profession"
DESCRIPTION = "The package offers BibLaTeX support for citations in German \
legal texts."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn64762"

RPM_NAME = "texlive-biblatex-jura2-2023.209.0.0.5svn64762-54.1.noarch.rpm"
RPM_HASH = "5d03692182f14997e865475581c10edc819011fb3ca4b13b169395f019f0ef5fa76b0561c8e18763e3ae6a8803a6871665eda53b73f54fdc4716d5b6e5e40aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jura2.bbx \
tex-jura2.cbx \
texlive-biblatex-jura2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ext-authortitle-ibid.bbx \
tex-ext-authortitle-ibid.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
