SUMMARY = "Macros for introductory physics and astronomy"
DESCRIPTION = "The package contains commands for students and teachers of \
introductory physics. Commands for physical quantities \
intelligently handle SI units so the user need not do so. There \
are other features that should make LaTeX easy for introductory \
physics students."
LICENSE = "LPPL-1.0"

PV = "2023.208.3.1.0svn61764"

RPM_NAME = "texlive-mandi-2023.208.3.1.0svn61764-53.1.noarch.rpm"
RPM_HASH = "90ae24f0d72b2c8586f4e7fb5be10fac7d58bc6230d7eea50bfe7239546ffb26b9bd5d444ebf6c06a56a7bcd9342b2677f34e0ac4c40e2cf8d617e26b91c817e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mandi.sty \
tex-mandiexp.sty \
tex-mandistudent.sty \
texlive-mandi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-enumitem.sty \
tex-eso-pic.sty \
tex-esvect.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-makebox.sty \
tex-mathtools.sty \
tex-nicematrix.sty \
tex-pgfopts.sty \
tex-qrcode.sty \
tex-tcolorbox.sty \
tex-tensor.sty \
tex-tikz.sty \
tex-unicode-math.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
