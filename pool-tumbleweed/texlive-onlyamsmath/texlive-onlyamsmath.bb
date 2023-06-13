SUMMARY = "Inhibit use of non-amsmath mathematics markup when using amsmath"
DESCRIPTION = "This package inhibits the usage of plain TeX and (on demand) of \
standard LaTeX mathematics environments. This is useful for \
class writers who want to encourage their users to use the \
environments provided by the amsmath package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.20svn42927"

RPM_NAME = "texlive-onlyamsmath-2023.201.0.0.20svn42927-54.1.noarch.rpm"
RPM_HASH = "0ed31356a4cc13edd9adb0016133a62dbddb0a85b91ba84b39242494d93544f6f424c70aa1010b3e6a043563691a9625f382f674665a5d14aafeb14fdc9e4279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(onlyamsmath.sty) \
texlive-onlyamsmath"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
