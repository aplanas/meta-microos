SUMMARY = "Information about register use"
DESCRIPTION = "The package will report number of used registers (counter, \
dimen, skip, muskip, box, token, input, output, math families, \
languages, insertions), and will compare the number to the \
maximum available number of such registers."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn25050"

RPM_NAME = "texlive-regstats-2023.201.1.0hsvn25050-53.1.noarch.rpm"
RPM_HASH = "dfc570ca7bdb017f7a6cbf0823b1836bb5ebe155b1d4963b08a283325aa3ac20a3be3ffbb2e024ca8bd1c00added22e12a7aacffcab2bf4877947c2167b74d21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regstats.sty \
texlive-regstats"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
tex-etex.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-intcalc.sty \
tex-kvoptions.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
