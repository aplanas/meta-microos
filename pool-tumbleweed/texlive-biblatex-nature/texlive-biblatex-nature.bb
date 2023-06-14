SUMMARY = "BibLaTeX support for Nature"
DESCRIPTION = "The bundle offers styles that allow authors to use BibLaTeX \
when preparing papers for submission to the journal Nature."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3dsvn57262"

RPM_NAME = "texlive-biblatex-nature-2023.201.1.3dsvn57262-53.1.noarch.rpm"
RPM_HASH = "2154b45e51bf8f3d9e51de2e46afe7b89de83a8b5f88275a4d9c321670aff52843d4873cc36927c9968b113eb62f3c4cab32676f61bcfe5f62ac5fea57aef50b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nature.bbx \
tex-nature.cbx \
texlive-biblatex-nature"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
