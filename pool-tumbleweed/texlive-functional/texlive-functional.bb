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

PV = "2023.201.2023asvn65485"

RPM_NAME = "texlive-functional-2023.201.2023asvn65485-52.1.noarch.rpm"
RPM_HASH = "5986e8c29b3779f220155e28ae4a6cca902ff773b2b50d396724151ae27ad02c9625fdbfef9dba3224af56d01def6fe4e4d095cafbf18e470e706e8db5a5a1bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(functional.sty) \
texlive-functional"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
