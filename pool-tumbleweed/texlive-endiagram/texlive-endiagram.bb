SUMMARY = "Easy creation of potential energy curve diagrams"
DESCRIPTION = "The package provides the facility of drawing potential energy \
curve diagrams with just a few simple commands. The package \
cannot (yet) be considered stable."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1dsvn34486"

RPM_NAME = "texlive-endiagram-2023.201.0.0.1dsvn34486-53.2.noarch.rpm"
RPM_HASH = "ef0b4d8f8b988373466dfa068d9519fc89136fe6b305625b77eda249ab73c7b14e0eaa4ca1507a61ff0ad1f71e86218b757d7c8853a885b89ff39c94fb9c75cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endiagram.sty \
texlive-endiagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
