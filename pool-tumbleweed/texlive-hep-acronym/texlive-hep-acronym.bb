SUMMARY = "An acronym extension for glossaries"
DESCRIPTION = "The hep-acronym package provides an acronym macro based on the \
glossaries package. The package is loaded with \
\\usepackage{hep-acronym}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64890"

RPM_NAME = "texlive-hep-acronym-2023.209.1.1svn64890-54.2.noarch.rpm"
RPM_HASH = "e49f41413f2bf084b44bf880d6b25121aece9dcd23a14b0d9f892ec4376470acc2ec683f7a7c1b2c4b28a917a712a6c54833582b98ef34c373447c6c1def1bd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-acronym.sty \
texlive-hep-acronym"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
tex-everyhook.sty \
tex-glossaries-extra.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
