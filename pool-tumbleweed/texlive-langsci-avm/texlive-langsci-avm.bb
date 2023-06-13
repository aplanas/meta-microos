SUMMARY = "Feature structures and attribute-value matrices (AVM)"
DESCRIPTION = "A package for typesetting feature structures, also known as \
attribute-value matrices (AVMs), for use in linguistics. The \
package provides a minimal and easy to read syntax. It depends \
only on the array package and can be placed almost everywhere, \
in particular in footnotes or graphs and tree structures. The \
package serves the same purpose as, Christopher Manning's avm \
package, but shares no code base with that package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn66016"

RPM_NAME = "texlive-langsci-avm-2023.201.0.0.3.0svn66016-55.1.noarch.rpm"
RPM_HASH = "53864b73b2428abcac4f7d54583e2affb7ff80668562e4cb441828e18044241dc5258c9699940fcd900d991b880e23a215aed983ac4987b57bfcadc0669e7492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(langsci-avm.sty) \
texlive-langsci-avm"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(etoolbox.sty) \
tex(tikz.sty) \
tex(unicode-math.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
