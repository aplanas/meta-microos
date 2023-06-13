SUMMARY = "Metafont version of tiles in the style of Slavik Jablan"
DESCRIPTION = "This is a small Metafont font to implement the modular tiles \
described by Slavik Jablan. For an outline of the theoretical \
structure of the tiles, see (for example) Jablan's JMM 2006 \
Exhibit."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn16364"

RPM_NAME = "texlive-jablantile-2023.201.svn16364-55.1.noarch.rpm"
RPM_HASH = "8614fd79fa138c00f3891ce0559359958068cd949a21a9362748df23614014c42bb874e126a1d44cdcea75b73b7b893042ff2bccaddb32d99e481f621110b77a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jablantile"

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
