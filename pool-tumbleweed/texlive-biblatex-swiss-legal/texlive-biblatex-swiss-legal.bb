SUMMARY = "Bibliography and citation styles following Swiss legal practice"
DESCRIPTION = "The package provides BibLaTeX bibliography and citation styles \
for documents written in accordance with Swiss legal citation \
standards in either French or German. However, according to \
https://tex.stackexchange.com/questions/426142/bibliography-usi \
ng-biblatex-swiss-legal-not-displayed-correctly the package is \
at present outdated and does not work properly with newer \
versions of BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2asvn64491"

RPM_NAME = "texlive-biblatex-swiss-legal-2023.209.1.1.2asvn64491-54.1.noarch.rpm"
RPM_HASH = "6c69a2d34a6922bcb6e49401b4f7c08711c313081cfea666e63dcc0f416859d6f49c75f47ff2ec081b9a43d3e26187da4fc5acdf8451927ff1f71a9480458641"
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

RDEPENDS:${PN} += "/usr/bin/sh \
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
