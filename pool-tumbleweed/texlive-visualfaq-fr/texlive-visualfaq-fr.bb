SUMMARY = "FAQ LaTeX visuelle francophone"
DESCRIPTION = "(French version below.) The Visual LaTeX FAQ is an innovative \
new search interface on LaTeX Frequently Asked Questions. This \
version is a French translation, offering links to the \
French-speaking LaTeX FAQ. Vous avez du mal a trouver la \
reponse a une question sur LaTeX ou meme a trouver les mots \
pour exprimer votre question? La FAQ LaTeX visuelle est une \
interface de recherche innovante qui presente plus d'une \
centaine d'exemples de mises en forme de documents frequemment \
demandees. Il suffit de cliquer sur l'hyperlien qui correspond \
a ce que vous souhaitez faire - ou ne pas faire - et la FAQ \
LaTeX visuelle enverra votre navigateur web a la page \
correspondante de la FAQ LaTeX francophone."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61420"

RPM_NAME = "texlive-visualfaq-fr-2023.209.svn61420-54.1.noarch.rpm"
RPM_HASH = "d646f4fff8688a9bc922329fdad6b62d107ae2e21e0c2f11f5d78a73936f3934b9b392c57f8ff637ad74cb213b873f6d0d2e5a1a9dff2a05574ec5a0b54a957b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualfaq-fr"

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
