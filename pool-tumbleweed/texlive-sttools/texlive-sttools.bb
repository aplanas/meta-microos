SUMMARY = "Various macros"
DESCRIPTION = "A collection of tools and macros, providing: miscellaneous \
float control, page styles for floats, multipage tabulars, even \
columns at end of twocolumn region, switching between one- and \
two-column anywhere, simulating the effect of 'midfloats', a \
package to manipulate numerical lists and arrays."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn60736"

RPM_NAME = "texlive-sttools-2023.201.3.0svn60736-57.1.noarch.rpm"
RPM_HASH = "67f71c8dcd47c0617b27a238f100a162264876ee61aca2c7aef059c7385b609285f900c61f8369d8f75f999c7194dd77d2d0f96ac4d3121e785afd7b4233e649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cuted.sty \
tex-floatpag.sty \
tex-flushend.sty \
tex-midfloat.sty \
tex-stabular.sty \
tex-stfloats.sty \
tex-texsort.sty \
texlive-sttools"

RDEPENDS:${PN} += "/bin/sh \
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
