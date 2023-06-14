SUMMARY = "Support multiple lines pseudocode"
DESCRIPTION = "This package extends the package algorithmicx to support long \
text which spans over multiple lines."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn56006"

RPM_NAME = "texlive-algxpar-2023.201.0.0.91svn56006-54.1.noarch.rpm"
RPM_HASH = "c399218c3fbcb13aa7986204daf802ea6b4a291fa990c8aed16538eda56766a9b2a5c330b6380f54a5ddffc76fd40d1cc709648f1b8db924ea950f8e61cb8681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algxpar.sty \
texlive-algxpar"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithmicx.sty \
tex-algpseudocode.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-fancyvrb.sty \
tex-listings.sty \
tex-ragged2e.sty \
tex-tcolorbox.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
