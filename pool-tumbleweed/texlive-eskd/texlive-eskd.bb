SUMMARY = "Modern Russian typesetting"
DESCRIPTION = "The class offers modern Russian text formatting, in accordance \
with accepted design standards. Fonts not (apparently) \
available on CTAN are required for use of the class."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-eskd-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "1f1c14c058ddb9ce860783b08877fb35f01eeb5c1eb7447b92115e500ae1b77aa2a38884c8b5753f1ad35a351556d5025b5c040646550b3c513e4a412e94ced7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eskd.cls \
texlive-eskd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-keyval.sty \
tex-lastpage.sty \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
