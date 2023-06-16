SUMMARY = "Pretty-print Matlab source code"
DESCRIPTION = "The package extends the facilities of the listings package, to \
pretty-print Matlab and Octave source code. (Note that support \
of Octave syntax is not complete.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn34323"

RPM_NAME = "texlive-matlab-prettifier-2023.201.0.0.3svn34323-52.1.noarch.rpm"
RPM_HASH = "34dadc3db624df3a1713c0958905b10be25f3786fc106377569ad07711d41a638950d7e8b0634bb4d9a81265aa6929964fa0140e3c018f789b02b1ff70205f1e"
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
