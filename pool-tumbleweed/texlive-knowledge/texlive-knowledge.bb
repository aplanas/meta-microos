SUMMARY = "Displaying, hyperlinking, and indexing notions in a document"
DESCRIPTION = "The package offers a systematic way to handle \
notions/concepts/terms throughout a document. It helps building \
an index. In combination with hyperref it makes it easy to have \
every reference of a concept linked to its introduction. It \
also offers simple notations."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.28svn61991"

RPM_NAME = "texlive-knowledge-2023.209.1.28svn61991-56.1.noarch.rpm"
RPM_HASH = "ee544fd9157774a740f50ef231dbaa293058130466fd857ac4304ad55d0b8dbab48746303a699b4eaf7101518a23f9bddcd4fd406c175734c15b4f50ea93f082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-knowledge.sty \
texlive-knowledge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
