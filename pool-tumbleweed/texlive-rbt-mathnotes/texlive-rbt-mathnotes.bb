SUMMARY = "Rebecca Turner's personal macros and styles for typesetting mathematics notes"
DESCRIPTION = "Styles for typesetting mathematics notes. Includes document \
classes for typesetting homework assignments and 'formula cheat \
sheets' for exams. Several examples are included, along with \
rendered PDFs."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn61193"

RPM_NAME = "texlive-rbt-mathnotes-2023.209.1.0.2svn61193-54.1.noarch.rpm"
RPM_HASH = "d381905922bc38611c733ee9991b9f4f8f0dbb6f1e6c3db32d98b81209cd96dbe0fa47ca8be47cb33d041a5fb6dc36f81b0c09d43a14d7052c7c55016073bf33"
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
