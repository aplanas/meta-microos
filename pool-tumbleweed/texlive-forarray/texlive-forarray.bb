SUMMARY = "Using array structures in LaTeX"
DESCRIPTION = "The package provides functionality for processing lists and \
array structures in LaTeX. Arrays can contain characters as \
well as TeX and LaTeX commands, nesting of arrays is possible, \
and arrays are processed within the same brace level as their \
surrounding environment. Array levels can be delimited by \
characters or control sequences defined by the user. Practical \
uses of this package include data management, construction of \
lists and tables, and calculations based on the contents of \
lists and arrays."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-forarray-2023.201.1.01svn15878-52.1.noarch.rpm"
RPM_HASH = "e49bb93119d4c11560ab9a88fd491bd2d25e731550692ed61d8ff2a493833920944b5c4ba9e45be7ba212e43510379c45fb6e83e1f4497cb0377c5f37fb0a906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-forarray.sty \
texlive-forarray"

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
