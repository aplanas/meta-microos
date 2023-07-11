SUMMARY = "Macros for mail merging"
DESCRIPTION = "This package is for use when sending a large number of letters, \
all with the same body text. The package's \\addressfile command \
is used to specify who the letter is to be sent to; the body of \
the \\mailingtext command specifies the text of the letters, \
possibly using macros defined in the \\addressfile."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-mailing-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "40a659fa232d990360f9a73e93bd625abdbcc3d8b610b8ac6dae479bdd0162142d0c3bc1567c8f3de030c4d9d170be55dc7e8c5dfd566c5113a341a4a7ba971c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mailing.sty \
texlive-mailing"

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
