SUMMARY = "Knuth's published errata"
DESCRIPTION = "These files record details of problems reported in Knuth's \
'Computers and Typesetting' series of books, for the Computer \
Modern fonts, and for TeX, Metafont and related programs."
LICENSE = "SUSE-TeX"

PV = "2023.201.svn58682"

RPM_NAME = "texlive-knuth-errata-2023.201.svn58682-55.1.noarch.rpm"
RPM_HASH = "8bdcc53636cfee4dc5cca7146e936d47f4a1a8614df81866573fc53a3488d09480311fadd35b92987201333ecc250dcd0bdc495fc8ab8708ca1dca0b677991d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-knuth-errata"

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
