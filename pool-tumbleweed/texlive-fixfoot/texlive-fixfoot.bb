SUMMARY = "Multiple use of the same footnote text"
DESCRIPTION = "Provides a \\DeclareFixedFootnote command to provide a single \
command for a frequently-used footnote. The package ensures \
that only one instance of the footnote text appears on each \
page (LaTeX needs to be run several times to achieve this)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn17131"

RPM_NAME = "texlive-fixfoot-2023.209.0.0.3asvn17131-53.1.noarch.rpm"
RPM_HASH = "615084765e597779185d2a959d9cd17544d0d3bbc207bae18bdbc0d44d64832fae8f9018717894965728f2136cf1a0811457960e6fb5e1d861bf515e42e20c60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixfoot.sty \
texlive-fixfoot"

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
