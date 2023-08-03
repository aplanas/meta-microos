SUMMARY = "Typeset FIRST Tech Challenge (FTC) notebooks"
DESCRIPTION = "This LaTeX package will greatly simplify filling entries for \
your FIRST Tech Challenge (FTC) engineering or outreach \
notebook. We developed this package to support most frequently \
used constructs encountered in an FTC notebook: meetings, \
tasks, decisions with pros and cons, tables, figures with \
explanations, team stories and bios, and more. We developed \
this package during the 2018-2019 season and are using it for \
our engineering notebook. Team Robocracy is sharing this style \
in the spirit of coopertition."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn50043"

RPM_NAME = "texlive-ftc-notebook-2023.209.1.1svn50043-53.1.noarch.rpm"
RPM_HASH = "31523d9c9df34b01c74a1e7adfbc9b8ee7a394751b496ac5d340a788558014113d0f1575c737a10d2bc94397d61237efd18cdef35640315918f24961aa749a7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ftc-notebook.sty \
texlive-ftc-notebook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-array.sty \
tex-arrayjobx.sty \
tex-calc.sty \
tex-caption.sty \
tex-colortbl.sty \
tex-datetime.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-inputenx.sty \
tex-kvoptions.sty \
tex-listings.sty \
tex-longtable.sty \
tex-mathptmx.sty \
tex-mfirstuc.sty \
tex-multido.sty \
tex-multirow.sty \
tex-needspace.sty \
tex-newunicodechar.sty \
tex-paralist.sty \
tex-subcaption.sty \
tex-suffix.sty \
tex-t1enc.sty \
tex-tabu.sty \
tex-textcomp.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
