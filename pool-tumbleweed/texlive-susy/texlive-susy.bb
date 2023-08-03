SUMMARY = "Macros for SuperSymmetry-related work"
DESCRIPTION = "The package provides abbreviations of longer expressions."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19440"

RPM_NAME = "texlive-susy-2023.209.svn19440-58.1.noarch.rpm"
RPM_HASH = "774bb90d0bd13f610eb894ec9db6bd590c0baad6a5214bd4b26168a77d526a61c020d0b1f94057237c7209f82a21c2abe97e31a2cbddcd317a5a5846336af924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-susy.sty \
texlive-susy"

RDEPENDS:${PN} += "/usr/bin/sh \
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
