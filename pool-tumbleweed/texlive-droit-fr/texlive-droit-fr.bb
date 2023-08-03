SUMMARY = "Document class and bibliographic style for French law"
DESCRIPTION = "The bundle provides a toolkit intended for students writing a \
thesis in French law. It features: a LaTeX document class; a \
bibliographic style for BibLaTeX package; a practical example \
of french thesis document; and documentation. The class assumes \
use of biber and BibLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn39802"

RPM_NAME = "texlive-droit-fr-2023.209.1.2svn39802-53.1.noarch.rpm"
RPM_HASH = "e810572e38fd22dea36c55a23c401aab7292cd636a205f03dfdccb24321353fe7105e2bcf357719b99e24bad5b78b0b2ce6d8bfb79e85afd9d9773cde5846c8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-droit-fr.bbx \
tex-droit-fr.cbx \
tex-droit-fr.cls \
texlive-droit-fr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-csquotes.sty \
tex-engrec.sty \
tex-filecontents.sty \
tex-footmisc.sty \
tex-ifdraft.sty \
tex-ifluatex.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-refcount.sty \
tex-verbose-ibid.bbx \
tex-verbose-ibid.cbx \
tex-xifthen.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
