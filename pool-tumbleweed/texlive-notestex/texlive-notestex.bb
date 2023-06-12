SUMMARY = "An all-in-one LaTeX notes package for students"
DESCRIPTION = "This is a modification of the original Jhep journal format in \
order to suit the needs of students in university. The goal of \
this package was to make notetaking easier for students and \
offer easy support for marginnotes along with a reliable and \
legible formatting structure."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45396"

RPM_NAME = "texlive-notestex-2023.201.1.0svn45396-54.1.noarch.rpm"
RPM_HASH = "619678428d567ac913c806b688ee12a3fb7ea68b0740677eed0c5da71fd0e2c2ca53168bae724eaa64254e3ccf658b85827f195bac5b7db627b7996c40680069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(NotesTeX.sty) \
texlive-notestex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(array.sty) \
tex(bm.sty) \
tex(booktabs.sty) \
tex(cancel.sty) \
tex(caption.sty) \
tex(color.sty) \
tex(enumitem.sty) \
tex(fancyhdr.sty) \
tex(float.sty) \
tex(fontenc.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(lmodern.sty) \
tex(marginnote.sty) \
tex(mathrsfs.sty) \
tex(mathtools.sty) \
tex(multicol.sty) \
tex(natbib.sty) \
tex(physics.sty) \
tex(setspace.sty) \
tex(sidenotes.sty) \
tex(tabularx.sty) \
tex(tcolorbox.sty) \
tex(tikz.sty) \
tex(titlesec.sty) \
tex(wrapfig.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
