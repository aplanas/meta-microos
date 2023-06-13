SUMMARY = "French translation of the documentation of array"
DESCRIPTION = "A French translation of the documentation of array."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24344"

RPM_NAME = "texlive-translation-array-fr-2023.201.svn24344-52.1.noarch.rpm"
RPM_HASH = "ba53d823b9440cc61ed701991b21c041343a7d7a7185f6056cc6c4c504e10250faaad4a1f16cfdc6ec9076c3197b2061d61022d5f02eacba17cd1d5e7a956032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-array-fr"

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
