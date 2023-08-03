SUMMARY = "A 'relaxed' font encoding"
DESCRIPTION = "LaTeX package providing a relaxed font encoding to make \
available to a font designer more slots for insertion of \
ligatures and accented characters."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22050"

RPM_NAME = "texlive-relenc-2023.209.svn22050-54.1.noarch.rpm"
RPM_HASH = "513180d0b39c1bfad782495f0f3c7969fef4d9d5cf55d1a79a2c912c155e24ee16dc1fc93fc0772693559757f351e2360c23f4d62fafec8e69f7a6d421553154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-2sidedoc.sty \
tex-ecsubzcm.sty \
tex-relenc.sty \
tex-t1renc.def \
tex-t1rzcm.fd \
tex-zcmr8d.tfm \
tex-zcmr8d.vf \
tex-zcmra.tfm \
tex-zcmra.vf \
texlive-relenc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmmi10.tfm \
tex-cmr10.tfm \
tex-cmr5.tfm \
tex-cmr6.tfm \
tex-cmsy10.tfm \
tex-cmtt10.tfm \
tex-cmu10.tfm \
tex-lasy10.tfm \
tex-lcircle10.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
