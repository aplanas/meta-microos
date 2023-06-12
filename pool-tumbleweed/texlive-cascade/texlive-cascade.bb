SUMMARY = "Constructions with braces to present mathematical demonstrations"
DESCRIPTION = "The LaTeX package cascade provides a command \\Cascade to do \
constructions to present mathematical demonstrations with \
successive braces for the deductions."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn65757"

RPM_NAME = "texlive-cascade-2023.201.1.2asvn65757-52.1.noarch.rpm"
RPM_HASH = "10e3b8115197b50639a6bd9d20c60f079c23c894c1308a395a4e0a1fabbd02e0856490e20c160dff234b3377890eee5b3577f29d468180f00b6f86f77f7ae9ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cascade.sty) \
texlive-cascade"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(l3keys2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
