SUMMARY = "Society of Biblical Literature (SBL) style files for BibLaTeX"
DESCRIPTION = "The package provides BibLaTeX support for citations in the \
format specified by the second edition of the Society of \
Biblical Literature (SBL) Handbook of Style. All example notes \
and bibliography entries from the handbook are supported and \
shown in an example file. A style file for writing SBL student \
papers is also included."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.14svn63639"

RPM_NAME = "texlive-biblatex-sbl-2023.209.0.0.14svn63639-54.1.noarch.rpm"
RPM_HASH = "7f817fd9f10a5ab29a6ba4dd048bdae8365f39802477f1115eb3d6b2159e406e1b975a70f11e0f0317c5b781b5f7b5516fc9ac625dc03be845ed567fab98f822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-sbl.lbx \
tex-biblatex-sbl.def \
tex-english-sbl.lbx \
tex-german-sbl.lbx \
tex-sbl-paper.sty \
tex-sbl.bbx \
tex-sbl.cbx \
tex-spanish-sbl.lbx \
texlive-biblatex-sbl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-american.lbx \
tex-biblatex.sty \
tex-bibleref-parse.sty \
tex-fancyhdr.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-imakeidx.sty \
tex-setspace.sty \
tex-standard.bbx \
tex-textcase.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
