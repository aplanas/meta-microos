SUMMARY = "Mark hyphenations in a document, for checking"
DESCRIPTION = "The package looks at all hyphenation breaks in the document, \
comparing them against a white-list prepared by the author. If \
a hyphenation break is found, for which there is no entry in \
the white-list, the package flags the line where the break \
starts. The author may then either add the hyphenation to the \
white-list, or adjust the document to avoid the break."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.7asvn47527"

RPM_NAME = "texlive-lua-check-hyphen-2023.208.0.0.7asvn47527-53.1.noarch.rpm"
RPM_HASH = "1880840f095795a59a2c09f4ca0d0f817542ea78c38d1ce55ba986ae9b2360deb8993eaab4bdae03c3672591b8d0f1ebbad035be45ff004769100b9e18d96b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lua-check-hyphen.sty \
texlive-lua-check-hyphen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-keyval.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
