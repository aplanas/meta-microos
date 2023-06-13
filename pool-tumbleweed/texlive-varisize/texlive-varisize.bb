SUMMARY = "Change font size in Plain TeX"
DESCRIPTION = "A series of files, each of which defines a size-change macro. \
Note that 10point.tex is by convention called by one of the \
other files, so that there's always a 'way back'."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-varisize-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "4a99804d7b92dc1cbb258180e0c53351e669f60771c3933686baf6c9c5b441eaf547b831ecf02a11a84501c15cf68b02601a64054a2ba11dd56b90b45956ab0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(10point.tex) \
tex(10pointss.tex) \
tex(11point.tex) \
tex(12point.tex) \
tex(14point.tex) \
tex(17point.tex) \
tex(20point.tex) \
tex(7point.tex) \
tex(8point.tex) \
tex(9point.tex) \
texlive-varisize"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
