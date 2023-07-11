SUMMARY = "Pretty-print Matlab source code"
DESCRIPTION = "The package extends the facilities of the listings package, to \
pretty-print Matlab and Octave source code. (Note that support \
of Octave syntax is not complete.)"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.3svn34323"

RPM_NAME = "texlive-matlab-prettifier-2023.208.0.0.3svn34323-53.1.noarch.rpm"
RPM_HASH = "bb04acf9c81453c6218f2ae331c22685a23d64f01e7ca780ec575a1893b91a19ca23b1b5fe9799a4dde3fa62047d73e5d718e1f4e7aad6ee85b2d73dd527a880"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-matlab-prettifier.sty \
texlive-matlab-prettifier"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-textcomp.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
