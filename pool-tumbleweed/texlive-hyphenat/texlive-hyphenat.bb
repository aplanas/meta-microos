SUMMARY = "Disable/enable hypenation"
DESCRIPTION = "This package can disable all hyphenation or enable hyphenation \
of non-alphabetics or monospaced fonts. The package can also \
enable hyphenation within 'words' that contain non-alphabetic \
characters (e.g., that include underscores), and hyphenation of \
text typeset in monospaced (e.g., cmtt) fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3csvn15878"

RPM_NAME = "texlive-hyphenat-2023.201.2.3csvn15878-52.1.noarch.rpm"
RPM_HASH = "1f79eba89ee43742d4d91f21ad6aaa3a21eb1c0c13415b98667058734d329cbc255fc40936bed53d2c164b7e19ffe1aeb585f7165c31f84306090893945c7115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyphenat.sty) \
texlive-hyphenat"

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
