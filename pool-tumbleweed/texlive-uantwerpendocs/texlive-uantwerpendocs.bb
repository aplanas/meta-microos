SUMMARY = "Course texts, master theses, and exams in University of Antwerp style"
DESCRIPTION = "These class files implement the house style of the University \
of Antwerp. This package originated from the Faculty of Applied \
Engineering. Using these class files will make it easy for you \
to make and keep your documents compliant to this version and \
future versions of the house style of the University of \
Antwerp."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.4svn64165"

RPM_NAME = "texlive-uantwerpendocs-2023.201.4.4svn64165-52.1.noarch.rpm"
RPM_HASH = "6cd2f7369d57366378ee08ed8f64599c327953c464ac564fb08ba1ed4ea411b45517c2fca0b175920cbb446e1fca12baf4a13adedbad1e9e0249dae6ee348438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeuantwerpen.sty \
tex-beamerfontthemeuantwerpen.sty \
tex-beamerinnerthemeuantwerpen.sty \
tex-beamerouterthemeuantwerpen.sty \
tex-beamerthemeuantwerpen.sty \
tex-uantwerpenbamathesis.cls \
tex-uantwerpencolorlogoscheme.sty \
tex-uantwerpencommonoptions.clo \
tex-uantwerpencoursetext.cls \
tex-uantwerpenexam.cls \
tex-uantwerpenletter.cls \
tex-uantwerpenphdthesis.cls \
tex-uantwerpenreport.cls \
texlive-uantwerpendocs"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-background.sty \
tex-bm.sty \
tex-cmbright.sty \
tex-color.sty \
tex-crop.sty \
tex-ean13isbn.sty \
tex-environ.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-sansmathaccent.sty \
tex-shellesc.sty \
tex-soul.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
