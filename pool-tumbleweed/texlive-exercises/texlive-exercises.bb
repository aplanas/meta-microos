SUMMARY = "Typeset exercises and solutions with automatic addition of points"
DESCRIPTION = "This package defines the environments exercise and solution. \
The layout of these environments can be customized. The -- \
optional -- points in the exercises can be added automatically. \
The package also permits to hide the solutions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn55188"

RPM_NAME = "texlive-exercises-2023.209.1.1svn55188-53.1.noarch.rpm"
RPM_HASH = "f84766b3bba64459675d2d7bca6452da7c4b71b9332858352adc9dff703430b44361e7a7e8008304e7a8eda8217a3af59f2605cb3e0920fa9aff4da08388ddc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exercises.sty \
texlive-exercises"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-marginnote.sty \
tex-verbatim.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
