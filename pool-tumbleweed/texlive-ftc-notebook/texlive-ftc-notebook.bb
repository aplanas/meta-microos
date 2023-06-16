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

PV = "2023.201.1.1svn50043"

RPM_NAME = "texlive-ftc-notebook-2023.201.1.1svn50043-52.1.noarch.rpm"
RPM_HASH = "38ac83549a0b12b96f8c44a75e061af180a22e5acbbd846ddc51d500453d67596ffcd27c0b3d0f3881bf82aa18c35af6a0c82bcc7aff8fb1ef3a03ebbb5292af"
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
