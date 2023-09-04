SUMMARY = "A 'relaxed' font encoding"
DESCRIPTION = "LaTeX package providing a relaxed font encoding to make \
available to a font designer more slots for insertion of \
ligatures and accented characters."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn22050"

RPM_NAME = "texlive-relenc-2023.209.svn22050-54.2.noarch.rpm"
RPM_HASH = "fe5540d12c707d5167072d7712ccb8af77e4b5b4d51b50641811e291abfddc3b098255610e977898d6068260c48cae7915bb83711ce777ccdd7ac3b8a9a9640e"
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
