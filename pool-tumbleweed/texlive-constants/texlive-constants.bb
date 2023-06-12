SUMMARY = "Automatic numbering of constants"
DESCRIPTION = "The package provides a way to number constants in a \
mathematical proof automatically, with a system for \
labelling/referencing. In addition, several families of \
constants (with different symbols) may be defined."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0svn15878"

RPM_NAME = "texlive-constants-2023.204.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "86ed73907c1029a069f84451b3c209d3abc91592f657268fe0d3ca5ef9925a80a47e3c39d5efe960d37550c209584a3dd574ae7499c9cce9d4abd6dd7e69d374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(constants.sty) \
texlive-constants"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
