SUMMARY = "Typeset a dissertation cover page following UNSW guidelines"
DESCRIPTION = "The package an UNSW cover sheet following the 2011 GRS \
guidelines. It may also (optionally) provide other required \
sheets such as Originality, Copyright and Authenticity \
statements."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn66115"

RPM_NAME = "texlive-unswcover-2023.201.1.0svn66115-53.1.noarch.rpm"
RPM_HASH = "d341c3227568cb3d6aeb4d3f3cdc85fb3ea1a8b5451cfea97d3fa6d9da0c82b53aec74c8a881c48fef6c4fcf69e12ef26276e38647796a33711a764937cf5f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unswcover.sty \
texlive-unswcover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-graphicx.sty \
tex-pdfpages.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
