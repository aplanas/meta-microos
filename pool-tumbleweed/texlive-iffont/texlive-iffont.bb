SUMMARY = "Conditionally load fonts with fontspec"
DESCRIPTION = "This package provides a macro to select the first font XeLaTeX \
or LuaTeX can find in a comma separated list and, additionally, \
a number of macro tests."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0.0svn38823"

RPM_NAME = "texlive-iffont-2023.208.1.0.0svn38823-53.1.noarch.rpm"
RPM_HASH = "e62866c25d8f783c929479ffdd368876758b3258d18ef1b5211045bfa348276d6295414bfbe5ef65cc8013932b633794b945ba5b820b87c77971aaa814ca77d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iffont.sty \
texlive-iffont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
