SUMMARY = "A mathematical calligraphic font based on rsfs"
DESCRIPTION = "The package provides virtual fonts and LaTeX support files for \
mathematical calligraphic fonts based on the rsfs Adobe Type 1 \
fonts (which must also be present for successful installation, \
with the slant substantially reduced. The output is quite \
similar to that from the Adobe Mathematical Pi script font."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn60849"

RPM_NAME = "texlive-rsfso-2023.201.1.03svn60849-53.1.noarch.rpm"
RPM_HASH = "c37e0d548ac8abcee6cb8050bd77b16418d906cc61786df465f368f145ed8fab369782d1ad36b1fba34f8604f7e1e831b1ae0ae61cc951f151a9bd2d5e18ae20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rrsfso10.tfm) \
tex(rrsfso5.tfm) \
tex(rrsfso7.tfm) \
tex(rsfso.map) \
tex(rsfso.sty) \
tex(rsfso10.tfm) \
tex(rsfso10.vf) \
tex(rsfso5.tfm) \
tex(rsfso5.vf) \
tex(rsfso7.tfm) \
tex(rsfso7.vf) \
tex(ursfso.fd) \
texlive-rsfso"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(cmr10.tfm) \
tex(cmr5.tfm) \
tex(cmr7.tfm) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
