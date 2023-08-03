SUMMARY = "Provide an intuitive functional programming interface for LaTeX2"
DESCRIPTION = "This package provides an intuitive functional programming \
interface for LaTeX2, which is an alternative choice to expl3 \
or LuaTeX, if you want to do programming in LaTeX. Although \
there are functions in LaTeX3 programming layer (expl3), the \
evaluation of them is from outside to inside. With this \
package, the evaluation of functions is from inside to outside, \
which is the same as other programming languages such as Lua. \
In this way, it is rather easy to debug code too."
LICENSE = "LPPL-1.0"

PV = "2023.209.2023asvn65485"

RPM_NAME = "texlive-functional-2023.209.2023asvn65485-53.1.noarch.rpm"
RPM_HASH = "227cb709c33093e324bda1e7ab38e904da7948374173d3a5b1bd9c7092c165fc96947c14124853c76134d11f92f3e3095d7bbe9a65e74758bb4103405a31bdb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-functional.sty \
texlive-functional"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
