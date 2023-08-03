SUMMARY = "Create glossaries using BibTeX"
DESCRIPTION = "A glossary package using BibTeX with \\cite replaced by \\gloss."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.2svn15878"

RPM_NAME = "texlive-gloss-2023.209.1.5.2svn15878-54.1.noarch.rpm"
RPM_HASH = "a44b1803b6aa3aaba7a86b3d96c08a16609a7f35b22359e9787401e0cefedffbf7d66080c0fae5439d031affaf5293990eb840ced9f68e6868c689cd0c75300b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gloss.sty \
texlive-gloss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
