SUMMARY = "Bibliography and citation styles following Swiss legal practice"
DESCRIPTION = "The package provides BibLaTeX bibliography and citation styles \
for documents written in accordance with Swiss legal citation \
standards in either French or German. However, according to \
https://tex.stackexchange.com/questions/426142/bibliography-usi \
ng-biblatex-swiss-legal-not-displayed-correctly the package is \
at present outdated and does not work properly with newer \
versions of BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.2asvn64491"

RPM_NAME = "texlive-biblatex-swiss-legal-2023.201.1.1.2asvn64491-53.1.noarch.rpm"
RPM_HASH = "e359361ab0cea740c1a1bb79e7c31e45ecfab0ec7f7b947353d5cd28305750df7cbfa64680a04c0faeb13f157c47bb63f80c98e309b09da49f5a2cfb4c80de85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-swiss-legal-base.bbx \
tex-biblatex-swiss-legal-base.cbx \
tex-biblatex-swiss-legal-bibliography.bbx \
tex-biblatex-swiss-legal-bibliography.cbx \
tex-biblatex-swiss-legal-de.lbx \
tex-biblatex-swiss-legal-fr.lbx \
tex-biblatex-swiss-legal-general.bbx \
tex-biblatex-swiss-legal-general.cbx \
tex-biblatex-swiss-legal-longarticle.bbx \
tex-biblatex-swiss-legal-longarticle.cbx \
tex-biblatex-swiss-legal-shortarticle.bbx \
tex-biblatex-swiss-legal-shortarticle.cbx \
texlive-biblatex-swiss-legal"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-french.lbx \
tex-ngerman.lbx \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
