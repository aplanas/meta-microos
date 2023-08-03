SUMMARY = "Fonts designed by Fra Luca de Pacioli in 1497"
DESCRIPTION = "Pacioli was a c.15 mathematician, and his font was designed \
according to 'the divine proportion'. The font is uppercase \
letters together with punctuation and some analphabetics; no \
lowercase or digits. The Metafont source is distributed in a \
.dtx file, together with LaTeX support."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24947"

RPM_NAME = "texlive-pacioli-2023.209.svn24947-52.1.noarch.rpm"
RPM_HASH = "565e3fbdb3f1ef4ba85a91dd3f033faa40aae14e20d2efd0624f0e83817f8d8f83bd41fd90a897f0f051cba72b9aa236ca232a2f821c1172597f2beb6c215b16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cpcr10.tfm \
tex-cpcsl10.tfm \
tex-ot1cpc.fd \
tex-pacioli.sty \
tex-t1cpc.fd \
texlive-pacioli"

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
