SUMMARY = "Prevent paragraph indentation after environments or macros"
DESCRIPTION = "The package, as the name suggests, supplies tools to \
automatically suppress indentations in following paragraphs, \
specifically those following a particular macro or environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn59195"

RPM_NAME = "texlive-noindentafter-2023.209.1.00svn59195-55.1.noarch.rpm"
RPM_HASH = "8045ff1cb7507665f1546b4304a84d6a1d6350e254ef09bb5088f81bbe875d3c8afe5bb8a67133b4e613dcd34bd6e0df987be038e6c9ad049dac1d796fada5c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-noindentafter.sty \
texlive-noindentafter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
