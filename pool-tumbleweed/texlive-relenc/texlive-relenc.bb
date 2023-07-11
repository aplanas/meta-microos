SUMMARY = "A 'relaxed' font encoding"
DESCRIPTION = "LaTeX package providing a relaxed font encoding to make \
available to a font designer more slots for insertion of \
ligatures and accented characters."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22050"

RPM_NAME = "texlive-relenc-2023.201.svn22050-53.2.noarch.rpm"
RPM_HASH = "efdecce8909d714d13f16f6d0440696e98251dcfd5c59d4ea8e572ccc90cfda58ec762b7826f6735e41405b6fe7fcc0717506d9542d099897f7cdf0cdd3b8498"
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
