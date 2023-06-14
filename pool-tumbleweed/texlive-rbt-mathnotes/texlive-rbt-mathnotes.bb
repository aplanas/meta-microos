SUMMARY = "Rebecca Turner's personal macros and styles for typesetting mathematics notes"
DESCRIPTION = "Styles for typesetting mathematics notes. Includes document \
classes for typesetting homework assignments and 'formula cheat \
sheets' for exams. Several examples are included, along with \
rendered PDFs."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn61193"

RPM_NAME = "texlive-rbt-mathnotes-2023.201.1.0.2svn61193-53.1.noarch.rpm"
RPM_HASH = "a9a4f8b82143725dfd160d1c704e09d5fce675cc45d7b98c013ffa3596b0123fa562d0e7af3e38d88179209a2c352ab5e5bb938e76f784698080b45993227475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rbt-mathnotes-formula-sheet.cls \
tex-rbt-mathnotes-hw.cls \
tex-rbt-mathnotes-messages.sty \
tex-rbt-mathnotes-util.sty \
tex-rbt-mathnotes.cls \
tex-rbt-mathnotes.sty \
texlive-rbt-mathnotes"

RDEPENDS:${PN} += "/bin/sh \
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
