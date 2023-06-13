SUMMARY = "A BibTeX replacement for users of BibLaTeX (multiscript version)"
DESCRIPTION = "This is the multiscript version of biber (biber-ms) and must be \
used with the multiscript version of biblatex-ms"
LICENSE = "Artistic-2.0 & GPL-2.0-or-later"

PV = "2023.201.4.0_1svn66478"

RPM_NAME = "texlive-biber-ms-2023.201.4.0_1svn66478-53.1.noarch.rpm"
RPM_HASH = "f91fcdc128f919e6488d306f0ffc403034178baafd2837a669432bee202639df7db5cc3922e6d4b708f1aa71a41865013cbcb5f4b4bcce37df5fb20b2fa22eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-ms"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-biber-ms-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
