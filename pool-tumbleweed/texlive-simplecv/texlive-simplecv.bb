SUMMARY = "A simple class for writing curricula vitae"
DESCRIPTION = "A derivative of the cv class available to lyx users (renamed to \
avoid the existing cv package)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6asvn35537"

RPM_NAME = "texlive-simplecv-2023.209.1.6asvn35537-54.1.noarch.rpm"
RPM_HASH = "59ebae481083faaec680368efa7a1e26e54f8c08a35f20fd9eca2b408d8b77ccbfc680d88b26c5e517fe016b5a0cc0369b07e5b1f0d8a2725726a564f1e15b79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplecv.cls \
texlive-simplecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
