SUMMARY = "A modern Greek font design"
DESCRIPTION = "GFS Artemisia is a relatively modern font, designed as a \
'general purpose' font in the same sense as Times is nowadays \
treated. The present version has been provided by the Greek \
Font Society. The font supports the Greek and Latin alphabets. \
LaTeX support is provided, using the OT1, T1 and LGR encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn19469"

RPM_NAME = "texlive-gfsartemisia-2023.201.1.0svn19469-52.1.noarch.rpm"
RPM_HASH = "536fb181508bf322a0c17914c9a36c421b715aa77d41e3920c77be8e0156ca116210d339c422426a43aa7e8719d06633e17c2435910be3d312dba092d983cd19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-artemisia.enc \
tex-artemisiab8a.tfm \
tex-artemisiab8a.vf \
tex-artemisiab8r.tfm \
tex-artemisiab9a.tfm \
tex-artemisiab9a.vf \
tex-artemisiab9r.tfm \
tex-artemisiabi8a.tfm \
tex-artemisiabi8a.vf \
tex-artemisiabi8r.tfm \
tex-artemisiabi9a.tfm \
tex-artemisiabi9a.vf \
tex-artemisiabi9r.tfm \
tex-artemisiabo8a.tfm \
tex-artemisiabo8a.vf \
tex-artemisiabo8r.tfm \
tex-artemisiabo9a.tfm \
tex-artemisiabo9a.vf \
tex-artemisiabo9r.tfm \
tex-artemisiadenomnums.enc \
tex-artemisiadenomnums8a.tfm \
tex-artemisiadenomnums8a.vf \
tex-artemisiadenomnums8r.tfm \
tex-artemisiaec.enc \
tex-artemisiaecsc.enc \
tex-artemisiael.enc \
tex-artemisiaelsc.enc \
tex-artemisiai8a.tfm \
tex-artemisiai8a.vf \
tex-artemisiai8r.tfm \
tex-artemisiai9a.tfm \
tex-artemisiai9a.vf \
tex-artemisiai9r.tfm \
tex-artemisiamath.enc \
tex-artemisiamath8a.tfm \
tex-artemisiamath8a.vf \
tex-artemisiamath8r.tfm \
tex-artemisianumnums.enc \
tex-artemisianumnums8a.tfm \
tex-artemisianumnums8a.vf \
tex-artemisianumnums8r.tfm \
tex-artemisiao8a.tfm \
tex-artemisiao8a.vf \
tex-artemisiao8r.tfm \
tex-artemisiao9a.tfm \
tex-artemisiao9a.vf \
tex-artemisiao9r.tfm \
tex-artemisiarg8a.tfm \
tex-artemisiarg8a.vf \
tex-artemisiarg8r.tfm \
tex-artemisiarg9a.tfm \
tex-artemisiarg9a.vf \
tex-artemisiarg9r.tfm \
tex-artemisiasc.enc \
tex-artemisiasc8a.tfm \
tex-artemisiasc8a.vf \
tex-artemisiasc8r.tfm \
tex-artemisiasc9a.tfm \
tex-artemisiasc9a.vf \
tex-artemisiasc9r.tfm \
tex-artemisiasco8a.tfm \
tex-artemisiasco8a.vf \
tex-artemisiasco8r.tfm \
tex-artemisiasco9a.tfm \
tex-artemisiasco9a.vf \
tex-artemisiasco9r.tfm \
tex-artemisiatabnums.enc \
tex-artemisiatabnums8a.tfm \
tex-artemisiatabnums8a.vf \
tex-artemisiatabnums8r.tfm \
tex-gartemisiab6a.tfm \
tex-gartemisiab6a.vf \
tex-gartemisiab6r.tfm \
tex-gartemisiabi6a.tfm \
tex-gartemisiabi6a.vf \
tex-gartemisiabi6r.tfm \
tex-gartemisiabo6a.tfm \
tex-gartemisiabo6a.vf \
tex-gartemisiabo6r.tfm \
tex-gartemisiai6a.tfm \
tex-gartemisiai6a.vf \
tex-gartemisiai6r.tfm \
tex-gartemisiao6a.tfm \
tex-gartemisiao6a.vf \
tex-gartemisiao6r.tfm \
tex-gartemisiarg6a.tfm \
tex-gartemisiarg6a.vf \
tex-gartemisiarg6r.tfm \
tex-gartemisiasc6a.tfm \
tex-gartemisiasc6a.vf \
tex-gartemisiasc6r.tfm \
tex-gartemisiasco6a.tfm \
tex-gartemisiasco6a.vf \
tex-gartemisiasco6r.tfm \
tex-gfsartemisia-euler.sty \
tex-gfsartemisia.map \
tex-gfsartemisia.sty \
tex-lgrartemisia.fd \
tex-lgrartemisiaeuler.fd \
tex-ot1artemisia.fd \
tex-ot1artemisiaeuler.fd \
tex-t1artemisia.fd \
tex-t1artemisiaeuler.fd \
tex-uartemisiaeulernums.fd \
tex-uartemisianums.fd \
texlive-gfsartemisia"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-euler.sty \
tex-txfonts.sty \
tex-txmi.tfm \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-gfsartemisia-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
