SUMMARY = "Fragments of LaTeX code"
DESCRIPTION = "A collection of fragments of LaTeX code, suitable for inclusion \
in packages, or (possibly) in users' documents. Included are: \
checklab, for modifying the label checking code at \
\\end{document}; overrightarrow, defining a doubled over-arrow \
macro; removefr, for removing 'reset' relations between \
counters; and subscript, defining a \\textsubscript command."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-fragments-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "f06508ea5d65798e96430b164c2de558bf56f218aace4b9960f5c19234877fa074d5f90717b85bd12ad854ffc2baabc62d8c861a9b2d62cd026a19c0b908f482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(checklab.tex) \
tex(overrightarrow.sty) \
tex(removefr.tex) \
tex(subscript.sty) \
texlive-fragments"

RDEPENDS:${PN} += "/bin/sh \
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
