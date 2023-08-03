SUMMARY = "Various macros"
DESCRIPTION = "A collection of tools and macros, providing: miscellaneous \
float control, page styles for floats, multipage tabulars, even \
columns at end of twocolumn region, switching between one- and \
two-column anywhere, simulating the effect of 'midfloats', a \
package to manipulate numerical lists and arrays."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn60736"

RPM_NAME = "texlive-sttools-2023.209.3.0svn60736-58.1.noarch.rpm"
RPM_HASH = "97bbd75dd84161255a35ffbdca3a5c085489bde29152a13228776ea301c8c1e927ed8a9239cea6f2e5c213e40808caa5b169cb2b762b95402228d9a1291954f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cuted.sty \
tex-floatpag.sty \
tex-flushend.sty \
tex-midfloat.sty \
tex-stabular.sty \
tex-stfloats.sty \
tex-texsort.sty \
texlive-sttools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
