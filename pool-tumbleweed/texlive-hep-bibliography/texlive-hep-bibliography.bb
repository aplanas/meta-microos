SUMMARY = "An acronym extension for glossaries"
DESCRIPTION = "The hep-bibliography package extends the BibLaTeX package with \
some functionality mostly useful for high energy physics. In \
particular it makes full use of all BibTeX fields provided by \
Discover High-Energy Physics. The package is loaded with \
\\usepackage{hep-bibliography}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64888"

RPM_NAME = "texlive-hep-bibliography-2023.201.1.1svn64888-53.1.noarch.rpm"
RPM_HASH = "ce546165e7631c5ee8b6741d8b50b9e6aa1c56501136edd7ae1047f49a54f4e4adbe8baae625ba593076d22ea951c8336060c63ee94181f7a5181a042b59bfce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hep-bibliography.sty) \
texlive-hep-bibliography"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(biblatex.sty) \
tex(kvoptions.sty) \
tex(relsize.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
