SUMMARY = "Extract subsets of documents"
DESCRIPTION = "The package defines an exercice environment which numbers every \
exercise, and a command \\get to extract a collection whose \
argument is a comma-separated set of exercise index numbers. \
While the package was designed for teachers constructing tables \
of exercises, it plainly has more general application."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.05.34svn27369"

RPM_NAME = "texlive-ktv-texdata-2023.209.05.34svn27369-56.1.noarch.rpm"
RPM_HASH = "da3fbc87a0e219626266d9d2398a0b6a9f31589c8b2b7dd7b9f297ed101243e987dcd8de548b235945e1d95b258bddf47aa08bc117b22f0b012a2611d376d10a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ktv-buildnum.sty \
tex-ktv-texdata.sty \
texlive-ktv-texdata"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
