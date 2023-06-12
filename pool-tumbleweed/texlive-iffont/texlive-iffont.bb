SUMMARY = "Conditionally load fonts with fontspec"
DESCRIPTION = "This package provides a macro to select the first font XeLaTeX \
or LuaTeX can find in a comma separated list and, additionally, \
a number of macro tests."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn38823"

RPM_NAME = "texlive-iffont-2023.201.1.0.0svn38823-52.1.noarch.rpm"
RPM_HASH = "a1fdfd91139ce52ab34ad5358be1f4481c390363b68370c24fab45d30349f2ba52eae0c72ac8272ae0fe9265ad857208c0100f43af5705ad29ebde12d6c22543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(iffont.sty) \
texlive-iffont"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(fontspec.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
