SUMMARY = "Fix magnification in pdfTeX"
DESCRIPTION = "A recent change to pdfTeX has caused magnification to apply to \
page dimensions. This small package changes the values set in \
the page dimension variables from pt to truept, thus evading \
the effects of \\mag."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-fixpdfmag-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "fb11b966966ed950bf30a5a0e674e8c0e4fded0ef2c86402ae2e41869cf48ee76decc489667afc5dd67f6c9a9a7bde4f8e1509e82f41f4c101e81b8381d768dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixpdfmag.tex \
texlive-fixpdfmag"

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
