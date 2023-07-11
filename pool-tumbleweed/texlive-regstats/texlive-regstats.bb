SUMMARY = "Information about register use"
DESCRIPTION = "The package will report number of used registers (counter, \
dimen, skip, muskip, box, token, input, output, math families, \
languages, insertions), and will compare the number to the \
maximum available number of such registers."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn25050"

RPM_NAME = "texlive-regstats-2023.201.1.0hsvn25050-53.2.noarch.rpm"
RPM_HASH = "d347cb2670f3d0325d81a86af0e81de04067a3a765bfca8e6c16205aaee22be65514ba953915fc4d92ff384e5789d80e6a0f09aed4366cca6db2f8597f4dd4b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regstats.sty \
texlive-regstats"

RDEPENDS:${PN} += "/usr/bin/sh \
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
