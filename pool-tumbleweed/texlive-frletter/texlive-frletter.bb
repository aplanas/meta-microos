SUMMARY = "Typeset letters in the French style"
DESCRIPTION = "A small class for typesetting letters in France. No assumption \
is made about the language in use. The class represents a small \
modification of the beletter class, which is itself a \
modification of the standard LaTeX letter class."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-frletter-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "b3acf9dac1e3280352531e32dea0fce5901615355d9052e45909835e75b65be97a891d31e4930eaad72d2f8ae1aa71b858805e78c066baebdb5d8ab406ae1a31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frletter.cls \
texlive-frletter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-letter.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
