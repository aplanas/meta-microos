SUMMARY = "Multiple mathematical accents"
DESCRIPTION = "A package for multiple accents in mathematics, with nice \
features concerning the creation of accents and placement of \
scripts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn51497"

RPM_NAME = "texlive-accents-2023.201.1.4svn51497-54.1.noarch.rpm"
RPM_HASH = "8a11ca9c8d16823547d807ea37dd92e1a7d78ad83cda8f553a5a4eeef16f7ab8f177e42ec66f933e9178ca7a9d5275b59ea827db8cdd6211334701cff9f67336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(accents.sty) \
texlive-accents"

RDEPENDS:${PN} += "/bin/sh \
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
