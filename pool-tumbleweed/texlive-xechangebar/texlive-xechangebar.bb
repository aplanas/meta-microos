SUMMARY = "An extension of package changebar that can be used with XeLaTeX"
DESCRIPTION = "The package extends package changebar so it can be used with \
XeLaTeX. It introduces the new option xetex for use with \
XeLaTeX. Everything else remains the same and users should \
consult the original documentation for usage information."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-xechangebar-2023.201.1.0svn54080-52.1.noarch.rpm"
RPM_HASH = "f6fa3017dcd1bb29b316c79f46214c42eb9ff51b8e48c7b9eed31efdccf8a675c7ebaef98c10ceaac9ac78e150662944d024b1a2f88659698310dede935021f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xechangebar.sty \
texlive-xechangebar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
