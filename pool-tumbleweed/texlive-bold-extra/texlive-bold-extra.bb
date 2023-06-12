SUMMARY = "Use bold small caps and typewriter fonts"
DESCRIPTION = "Allows access to 'extra' bold fonts for Computer Modern OT1 \
encoding (the fonts are available in Metafont source). Since \
there is more than one bold tt-family font set, the version \
required is selected by a package option."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn17076"

RPM_NAME = "texlive-bold-extra-2023.201.0.0.1svn17076-52.1.noarch.rpm"
RPM_HASH = "d9c78d2f72398db69f9bd0778e9822ad12ece9bf332b27b9c200f6fc24beb2ed05415631b075e565dc0fb8e1903ca83c4efb3c43e2b72c6e273cc2b297fb793b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bold-extra.sty) \
texlive-bold-extra"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
