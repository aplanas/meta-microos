SUMMARY = "OrnementsADF font with TeX/LaTeX support"
DESCRIPTION = "The bundle provides the Ornements ADF font in PostScript type 1 \
format with TeX/LaTeX support files. The font is licensed under \
GPL v2 or later with font exception. (See NOTICE, COPYING, \
README.) The TeX/LaTeX support is licensed under LPPL. (See \
README, manifest.txt.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn54512"

RPM_NAME = "texlive-adforn-2023.209.1.1bsvn54512-55.1.noarch.rpm"
RPM_HASH = "178af1bcecf32c6f8f66b5ba36ec29cc546a1d41a861e3400e18f0fe3e57cd9e752cdd2506d611877e545b60fcac27d79f32edd5129acab55532e208d1e882ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-OrnementsADF.enc \
tex-OrnementsADF.map \
tex-OrnementsADF.tfm \
tex-adforn.sty \
tex-uornementsadf.fd \
texlive-adforn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pifont.sty \
tex-updmap.cfg \
texlive \
texlive-adforn-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
