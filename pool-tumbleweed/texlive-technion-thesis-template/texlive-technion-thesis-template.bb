SUMMARY = "Template for theses on the Technion graduate school"
DESCRIPTION = "This is a template for writing a thesis according to the \
Technion specifications."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn49889"

RPM_NAME = "texlive-technion-thesis-template-2023.201.1.0svn49889-54.1.noarch.rpm"
RPM_HASH = "f4de9296a5499cebc1e19e58ae5e2dfc5c52dfb3149fb7610979d1f1c266385cf5d17f556c40b702327f42e7d9d27231570946b764481e7148ad3d66c10baf3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(technionThesis.cls) \
tex(technionThesisSetup.sty) \
texlive-technion-thesis-template"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(IEEEtrantools.sty) \
tex(accents.sty) \
tex(algorithm2e.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(atbegshi.sty) \
tex(booktabs.sty) \
tex(cabin.sty) \
tex(calc.sty) \
tex(centernot.sty) \
tex(cite.sty) \
tex(cleveref.sty) \
tex(datetime.sty) \
tex(etoolbox.sty) \
tex(eucal.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(graphicx.sty) \
tex(hebrewcal.sty) \
tex(hyperref.sty) \
tex(indentfirst.sty) \
tex(libertine.sty) \
tex(longtable.sty) \
tex(mathtools.sty) \
tex(memoir.cls) \
tex(metalogo.sty) \
tex(multirow.sty) \
tex(newtxmath.sty) \
tex(pgfplots.sty) \
tex(polyglossia.sty) \
tex(stackrel.sty) \
tex(subfig.sty) \
tex(tabto.sty) \
tex(textcomp.sty) \
tex(thmtools.sty) \
tex(tikz.sty) \
tex(url.sty) \
tex(xifthen.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
