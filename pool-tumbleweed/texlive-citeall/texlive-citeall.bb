SUMMARY = "Cite all entries of a bbl created with BibLaTeX"
DESCRIPTION = "This small package allows to cite all entries of a bbl-file \
created with BibLaTeX (v1.9)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn45975"

RPM_NAME = "texlive-citeall-2023.201.1.4svn45975-53.1.noarch.rpm"
RPM_HASH = "d5aa165aeb58e6dd3d739a56751e54e012f43c8a7fcd63d415101286b1bbe6a341be8a509e5adbec3386925c5e3084a9c0916a05fd8b65c4c8ca1eb52794bde2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-citeall.sty \
texlive-citeall"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
