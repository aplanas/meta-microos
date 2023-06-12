SUMMARY = "Specify arbitrary fonts for mathematics in XeTeX"
DESCRIPTION = "The mathspec package provides an interface to typeset \
mathematics in XeLaTeX with arbitrary text fonts using fontspec \
as a backend. The package is under development and later \
versions might to be incompatible with this version, as this \
version is incompatible with earlier versions. The package \
requires at least version 0.9995 of XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2bsvn42773"

RPM_NAME = "texlive-mathspec-2023.201.0.0.2bsvn42773-52.1.noarch.rpm"
RPM_HASH = "87f777bfbc517239b91db16b3bcc12e756275f03d4df0034340bb05bc3b9741954fe6c20dad0259bc6597be3eccef9558908a27de14fb65080fb0dcfa927e6f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mathspec.sty) \
texlive-mathspec"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(MnSymbol.sty) \
tex(amstext.sty) \
tex(etoolbox.sty) \
tex(fontspec.sty) \
tex(ifxetex.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
