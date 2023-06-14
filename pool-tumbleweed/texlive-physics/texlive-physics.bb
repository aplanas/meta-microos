SUMMARY = "Macros supporting the Mathematics of Physics"
DESCRIPTION = "The package defines simple and flexible macros for typesetting \
equations in the languages of vector calculus and linear \
algebra, using Dirac notation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn28590"

RPM_NAME = "texlive-physics-2023.201.1.3svn28590-51.1.noarch.rpm"
RPM_HASH = "47f033b784baf64b5116f94ca73c8dc67ca67d8970d3c6dbfafd6c16df41c9f2098702d657d6b473a758657b0956f1c80cd466122b6e2f3e2d7a6e84339d207f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-physics.sty \
texlive-physics"

RDEPENDS:${PN} += "/bin/sh \
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
