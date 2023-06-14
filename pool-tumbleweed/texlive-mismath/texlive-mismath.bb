SUMMARY = "Miscellaneous mathematical macros"
DESCRIPTION = "The package provides some mathematical macros to typeset: \
mathematical constants e, i, p in upright shape (automatically) \
as recommended by ISO 80000-2, vectors with beautiful arrows \
and adjusted norm, some standard operator names, improved \
spacings in mathematical formulas, systems of equations and \
small matrices, displaymath in double columns for long \
calculations."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn66391"

RPM_NAME = "texlive-mismath-2023.201.2.7svn66391-54.1.noarch.rpm"
RPM_HASH = "fe734da348b7dde3873004ebadd4bb5fd17fd4bb797a49d8a1bca166b4b2bbce570397ba28c7dd2d0eb0d4dbd4aa448c85cd17ff72714f6c3a9af3e2602dc9df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mismath.sty \
texlive-mismath"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-esvect.sty \
tex-fontenc.sty \
tex-ibrackets.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-mathtools.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
