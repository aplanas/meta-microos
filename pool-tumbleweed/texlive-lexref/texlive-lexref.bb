SUMMARY = "Convenient and uniform references to legal provisions"
DESCRIPTION = "The package is aimed at continental lawyers (especially those \
in Switzerland and Germany), allowing the user to make \
references to legal provisions conveniently and uniformly. The \
package also allows the user to add cited Acts to a \
nomenclature list (automatically), and to build specific \
indexes for each cited Act. The package is still under \
development, and should be treated as an 'alpha'-release."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn36026"

RPM_NAME = "texlive-lexref-2023.201.1.1asvn36026-54.1.noarch.rpm"
RPM_HASH = "38397e0c124108c80fac78c6b4a1bcb473c4f5e4969c4ff5fb4677e14f4f38d1bd0e39d06b20fd2ee5f60d25fce114441d5d5e7e5ab091ea7c365c3019d86bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lexref.sty) \
texlive-lexref"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(ifthen.sty) \
tex(nomencl.sty) \
tex(splitidx.sty) \
tex(stringstrings.sty) \
tex(xargs.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
