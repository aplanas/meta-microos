SUMMARY = "Specify arbitrary fonts for mathematics in XeTeX"
DESCRIPTION = "The mathspec package provides an interface to typeset \
mathematics in XeLaTeX with arbitrary text fonts using fontspec \
as a backend. The package is under development and later \
versions might to be incompatible with this version, as this \
version is incompatible with earlier versions. The package \
requires at least version 0.9995 of XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2bsvn42773"

RPM_NAME = "texlive-mathspec-2023.208.0.0.2bsvn42773-53.1.noarch.rpm"
RPM_HASH = "0552dfbb2a6b8169e98eb60396f2a2a15798e0a63dbd3520254a77e3c092956adb09b1e19b08d776711ef30fd88974ac1e9058c3341e2349407a67f28432fd0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathspec.sty \
texlive-mathspec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-MnSymbol.sty \
tex-amstext.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-ifxetex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
