SUMMARY = "Change kerning for German quotation marks"
DESCRIPTION = "The package germcorr has to be loaded after the package german. \
It brings some letters like T nearer to german single and \
double quotes even when that letter wears a standard accent \
like '`\\.T''."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-germkorr-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "01beacd27cbd581b6d629ff5ff50aec5e94e5f8a559ba2f4f144751472060c0a774c1dc0ed1d773997229f3f38220d59bc7f63a5d4cb19a8138d7f6a93e50882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(germkorr.sty) \
texlive-germkorr"

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
