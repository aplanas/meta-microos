SUMMARY = "A bundle of miscellaneous footnote packages"
DESCRIPTION = "Contains three packages: - pfnote to number footnotes per page; \
- fnpos to control the position of footnotes; and - dblfnote to \
make footnotes double-columned."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48568"

RPM_NAME = "texlive-yafoot-2023.201.1.1svn48568-52.1.noarch.rpm"
RPM_HASH = "cfa9b4e67441e9c1f96c771935bc494f8bcc9e7e6be04879c828c5e5fc2ca38a2acf8acf693f2215ed9e127bde954d88b756c124815a48b652eccb2d7562a145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dblfnote.sty \
tex-fnpos.sty \
tex-pfnote.sty \
texlive-yafoot"

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
