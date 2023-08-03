SUMMARY = "Fonts from the Trajan column in Rome"
DESCRIPTION = "Provides fonts (both as Metafont source and in Adobe Type 1 \
format) based on the capitals carved on the Trajan column in \
Rome in 114 AD, together with macros to access the fonts. Many \
typographers think these rank first among the Roman's artistic \
legacy. The font is uppercase letters together with some \
punctuation and analphabetics; no lowercase or digits."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-trajan-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "b2ec30d7e95959e7a45978e072d888b85fd5aa6a5c939427785897b1793454021e9ccf4c12249c186751c03df10272b303ffa4c4f654ad22054b9c99e88c6379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t1trjn.fd \
tex-trajan.map \
tex-trajan.sty \
tex-trjnr10.tfm \
tex-trjnsl10.tfm \
texlive-trajan"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-trajan-fonts"

inherit rpm
