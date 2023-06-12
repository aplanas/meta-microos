SUMMARY = "A symbol (dingbat) font and LaTeX macros for its use"
DESCRIPTION = "A symbol font (distributed as Metafont source) that contains \
many of the symbols of the Zapf dingbats set, together with an \
NFSS interface for using the font. An Adobe Type 1 version of \
the fonts is available in the niceframe fonts bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn17186"

RPM_NAME = "texlive-bbding-2023.201.1.01svn17186-53.1.noarch.rpm"
RPM_HASH = "1e22e4e9eeff4df60b26a95d8f83d6e821910921495a15113090ec77e31b5d150568edf4c3ed129f9c29bbbdf44988bf279877a8d4849344eb506e65ceb387c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Uding.fd) \
tex(bbding.sty) \
tex(bbding10.tfm) \
texlive-bbding"
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
