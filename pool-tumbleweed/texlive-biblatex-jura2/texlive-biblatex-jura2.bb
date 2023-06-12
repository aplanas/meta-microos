SUMMARY = "Citation style for the German legal profession"
DESCRIPTION = "The package offers BibLaTeX support for citations in German \
legal texts."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn64762"

RPM_NAME = "texlive-biblatex-jura2-2023.201.0.0.5svn64762-53.1.noarch.rpm"
RPM_HASH = "0f665bb066298ac88118e6f8beea12cdb81c87dbe6330efb0a26439a98df3dcb7353f293d54b9fa940c90567b54ff3d598764e77af585265bbe1bbc8cdbf264d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(jura2.bbx) \
tex(jura2.cbx) \
texlive-biblatex-jura2"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ext-authortitle-ibid.bbx) \
tex(ext-authortitle-ibid.cbx) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
