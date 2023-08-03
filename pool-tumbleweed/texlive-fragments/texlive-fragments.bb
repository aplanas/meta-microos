SUMMARY = "Fragments of LaTeX code"
DESCRIPTION = "A collection of fragments of LaTeX code, suitable for inclusion \
in packages, or (possibly) in users' documents. Included are: \
checklab, for modifying the label checking code at \
\\end{document}; overrightarrow, defining a doubled over-arrow \
macro; removefr, for removing 'reset' relations between \
counters; and subscript, defining a \\textsubscript command."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-fragments-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "5e56a301098b8402cc85c86be8fc9541f0c6be36d90035c253ec324db8e1d3b1b28c48134864c27db8d7bf63efb451ae871177a1f5f37baf8dbf0392314c63ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-checklab.tex \
tex-overrightarrow.sty \
tex-removefr.tex \
tex-subscript.sty \
texlive-fragments"

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
