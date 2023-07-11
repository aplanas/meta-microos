SUMMARY = "Disable/enable hypenation"
DESCRIPTION = "This package can disable all hyphenation or enable hyphenation \
of non-alphabetics or monospaced fonts. The package can also \
enable hyphenation within 'words' that contain non-alphabetic \
characters (e.g., that include underscores), and hyphenation of \
text typeset in monospaced (e.g., cmtt) fonts."
LICENSE = "LPPL-1.0"

PV = "2023.208.2.3csvn15878"

RPM_NAME = "texlive-hyphenat-2023.208.2.3csvn15878-53.1.noarch.rpm"
RPM_HASH = "74f39f94ae4ce47c03ba684e1a267e979ecdbba8b225a2ab3d9d82eb4587a2dde4bb451b54bf9c21a32f22a5d54a030b533f3c0289b79402c42aa007556a9170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyphenat.sty \
texlive-hyphenat"

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
