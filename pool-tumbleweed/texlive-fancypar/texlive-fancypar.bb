SUMMARY = "Decoration of individual paragraphs"
DESCRIPTION = "Decorates individual paragraphs of a document, offering five \
pre-defined styles. The command offers an optional 'key-value' \
argument with the user may define parameters of the selected \
style. Predefined styles offer a spiral-notebook, a zebra-like, \
a dashed, a marked design, and an underlined style. Users may \
also define their own styles. Decorated paragraphs may not \
include displayed mathematics."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn58895"

RPM_NAME = "texlive-fancypar-2023.209.1.3svn58895-53.1.noarch.rpm"
RPM_HASH = "f85ad6c555fae0b307355644fb0fc5416b6c766932678f1ea4498d598de4f523d1cb313a1b9142e06dcbe889b140d47ea03b838b6c40dc81a8e9f978f1d3acd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancypar.sty \
texlive-fancypar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
