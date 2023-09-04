SUMMARY = "Rebecca Turner's personal macros and styles for typesetting mathematics notes"
DESCRIPTION = "Styles for typesetting mathematics notes. Includes document \
classes for typesetting homework assignments and 'formula cheat \
sheets' for exams. Several examples are included, along with \
rendered PDFs."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn61193"

RPM_NAME = "texlive-rbt-mathnotes-2023.209.1.0.2svn61193-54.2.noarch.rpm"
RPM_HASH = "45e28e30d8ea7e49939c75446d427deb0631ceb7bd0a75b3141f2804102b744ecb09bf1497e388ca5e9ab16b4b2c957ca37268daaf64ff79a5611cb71782d7fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rbt-mathnotes-formula-sheet.cls \
tex-rbt-mathnotes-hw.cls \
tex-rbt-mathnotes-messages.sty \
tex-rbt-mathnotes-util.sty \
tex-rbt-mathnotes.cls \
tex-rbt-mathnotes.sty \
texlive-rbt-mathnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-article.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-footmisc.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-knowledge.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-longtable.sty \
tex-mathtools.sty \
tex-mdframed.sty \
tex-memoir.cls \
tex-multicol.sty \
tex-multirow.sty \
tex-ntheorem.sty \
tex-stix2.sty \
tex-tabu.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
