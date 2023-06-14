SUMMARY = "Society of Biblical Literature (SBL) style files for BibLaTeX"
DESCRIPTION = "The package provides BibLaTeX support for citations in the \
format specified by the second edition of the Society of \
Biblical Literature (SBL) Handbook of Style. All example notes \
and bibliography entries from the handbook are supported and \
shown in an example file. A style file for writing SBL student \
papers is also included."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.14svn63639"

RPM_NAME = "texlive-biblatex-sbl-2023.201.0.0.14svn63639-53.1.noarch.rpm"
RPM_HASH = "741c61e0ac3175ec4293cb10065d38927e17bd14fd6568acbbdf3e5c38ecfa2ee85bd466a350105120e6a7dcd8ae176a19264ef12f885f9f353426d86555f255"
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

RDEPENDS:${PN} += "/bin/sh \
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
