SUMMARY = "Automatic numbering of constants"
DESCRIPTION = "The package provides a way to number constants in a \
mathematical proof automatically, with a system for \
labelling/referencing. In addition, several families of \
constants (with different symbols) may be defined."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-constants-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "ed7f67ffde13c0b427ed53002c7ad98c9e861e5b1a1944c7acf463c5ce5bd68381d48e48006054dec879ba73b15ae87770df329acf9f478a2081803f67b4ae0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-constants.sty \
texlive-constants"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
