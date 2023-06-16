SUMMARY = "A 'relaxed' font encoding"
DESCRIPTION = "LaTeX package providing a relaxed font encoding to make \
available to a font designer more slots for insertion of \
ligatures and accented characters."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22050"

RPM_NAME = "texlive-relenc-2023.201.svn22050-53.1.noarch.rpm"
RPM_HASH = "80127b6a7356ad60580365301199c958e5a8e56e763be81abd8432d64cd8a8061dbd0ee3f94e32fdac4c7d65f492d0806931da176ada57009e0dad44970f3552"
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
