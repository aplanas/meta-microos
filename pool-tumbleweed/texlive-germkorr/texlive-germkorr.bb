SUMMARY = "Change kerning for German quotation marks"
DESCRIPTION = "The package germcorr has to be loaded after the package german. \
It brings some letters like T nearer to german single and \
double quotes even when that letter wears a standard accent \
like '`\\.T''."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-germkorr-2023.209.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "0a53c5df48ab943a797da310f223598417597e1486aa4b30a18fbde597cf493bcb488c953b6e7e5e613f12091f09c813b74788a97da5d568cea7146bebe552e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-germkorr.sty \
texlive-germkorr"

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
