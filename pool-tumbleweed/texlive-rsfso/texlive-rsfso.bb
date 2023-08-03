SUMMARY = "A mathematical calligraphic font based on rsfs"
DESCRIPTION = "The package provides virtual fonts and LaTeX support files for \
mathematical calligraphic fonts based on the rsfs Adobe Type 1 \
fonts (which must also be present for successful installation, \
with the slant substantially reduced. The output is quite \
similar to that from the Adobe Mathematical Pi script font."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn60849"

RPM_NAME = "texlive-rsfso-2023.209.1.03svn60849-54.1.noarch.rpm"
RPM_HASH = "ee8ba16241962e41c4b07ff211b0c8bbd45bda31e651eb3bf2852428149905eac9672636e4f36d2302f653d68615c24dee56aedb9f428360eef2f7809098ae15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rrsfso10.tfm \
tex-rrsfso5.tfm \
tex-rrsfso7.tfm \
tex-rsfso.map \
tex-rsfso.sty \
tex-rsfso10.tfm \
tex-rsfso10.vf \
tex-rsfso5.tfm \
tex-rsfso5.vf \
tex-rsfso7.tfm \
tex-rsfso7.vf \
tex-ursfso.fd \
texlive-rsfso"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmr10.tfm \
tex-cmr5.tfm \
tex-cmr7.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
