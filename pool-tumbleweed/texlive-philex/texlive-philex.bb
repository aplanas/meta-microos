SUMMARY = "Cross references for named and numbered environments"
DESCRIPTION = "Philex provides means for creating and cross-referencing named \
or numbered environments. Possible uses would be equations, \
example sentences (as in linguistics or philosophy) or named \
principles. Cross references may refer either to the number, or \
to a short name of the target environment, or to the contents \
of the environment. Philex builds on the facilities of the \
linguex package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn36396"

RPM_NAME = "texlive-philex-2023.201.1.3svn36396-51.1.noarch.rpm"
RPM_HASH = "7a62cba7dc729b1592fae08ee1a3313b69c3fa15a6381af6bf57a62a69fba37b474b6b0515759fcac8ce6c317ec01ad668d7197a32acbb14ae0a740dea25fcf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(philex.sty) \
texlive-philex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(cgloss4e.sty) \
tex(ifthen.sty) \
tex(linguex.sty) \
tex(suffix.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
