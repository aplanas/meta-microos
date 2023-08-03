SUMMARY = "Macros supporting the Mathematics of Physics"
DESCRIPTION = "The package defines simple and flexible macros for typesetting \
equations in the languages of vector calculus and linear \
algebra, using Dirac notation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn28590"

RPM_NAME = "texlive-physics-2023.209.1.3svn28590-52.1.noarch.rpm"
RPM_HASH = "ed881f0f00824ba5364cbf6a0b7b8afc0561e2f539fa57da99615338eee20ea5d548fe3080887c36455b30b9dd20d211b9ae425627d4ba1c63e3768b9085ba57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-physics.sty \
texlive-physics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
