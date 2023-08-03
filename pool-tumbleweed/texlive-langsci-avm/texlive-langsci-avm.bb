SUMMARY = "Feature structures and attribute-value matrices (AVM)"
DESCRIPTION = "A package for typesetting feature structures, also known as \
attribute-value matrices (AVMs), for use in linguistics. The \
package provides a minimal and easy to read syntax. It depends \
only on the array package and can be placed almost everywhere, \
in particular in footnotes or graphs and tree structures. The \
package serves the same purpose as, Christopher Manning's avm \
package, but shares no code base with that package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn66016"

RPM_NAME = "texlive-langsci-avm-2023.209.0.0.3.0svn66016-56.1.noarch.rpm"
RPM_HASH = "4f01aee6c01674c304f172e6170a08f61da562942ce538f21a6a570410059bf239979ce39813d05f712f4c664ae811a32dfe89bb61f260bc925fb6c9fb9fbd8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-langsci-avm.sty \
texlive-langsci-avm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-etoolbox.sty \
tex-tikz.sty \
tex-unicode-math.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
