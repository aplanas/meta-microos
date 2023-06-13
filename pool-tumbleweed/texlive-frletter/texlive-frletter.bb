SUMMARY = "Typeset letters in the French style"
DESCRIPTION = "A small class for typesetting letters in France. No assumption \
is made about the language in use. The class represents a small \
modification of the beletter class, which is itself a \
modification of the standard LaTeX letter class."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-frletter-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "561f81eeb613de0cc395f37ab67a2c1adc124b255c7a90fdf3ed61fc6109430f321c41dcb982f3566b38544c5d16190a58bc387fcb5ef33921607b83b50eadff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(frletter.cls) \
texlive-frletter"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(letter.cls) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
