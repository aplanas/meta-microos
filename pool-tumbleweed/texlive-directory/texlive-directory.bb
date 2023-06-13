SUMMARY = "An address book using BibTeX"
DESCRIPTION = "A package for LaTeX and BibTeX that facilitates the \
construction, maintenance and exploitation of an address \
book-like database."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn15878"

RPM_NAME = "texlive-directory-2023.201.1.20svn15878-52.1.noarch.rpm"
RPM_HASH = "66076d7dd1e700fa1f20f1232c0f496c0b0383c77f0a145d5a2bdcc38fcd63a2275a724d737fee68763cbe2cbb22b7ab2aac996d4da7dd77faed2dc3de35e62e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(directory.sty) \
texlive-directory"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(url.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
