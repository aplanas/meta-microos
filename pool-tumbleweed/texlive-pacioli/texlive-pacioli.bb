SUMMARY = "Fonts designed by Fra Luca de Pacioli in 1497"
DESCRIPTION = "Pacioli was a c.15 mathematician, and his font was designed \
according to 'the divine proportion'. The font is uppercase \
letters together with punctuation and some analphabetics; no \
lowercase or digits. The Metafont source is distributed in a \
.dtx file, together with LaTeX support."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24947"

RPM_NAME = "texlive-pacioli-2023.201.svn24947-51.1.noarch.rpm"
RPM_HASH = "0d086b0788e75b40908da255e79d0b82a91e6600f70c0754fa2809eb9134138c6f109d0f71b926e986b798b677142c3776fb4cf1e04cde1fd08ce26a8ebec97e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cpcr10.tfm) \
tex(cpcsl10.tfm) \
tex(ot1cpc.fd) \
tex(pacioli.sty) \
tex(t1cpc.fd) \
texlive-pacioli"

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
