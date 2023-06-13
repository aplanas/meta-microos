SUMMARY = "IPA (Japanese) fonts"
DESCRIPTION = "The fonts provide fixed-width glyphs for Kana and Kanji \
characters, proportional width glyphs for Western characters."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-ipaex-2023.201.svn61719-55.1.noarch.rpm"
RPM_HASH = "2d7779e55e8d8c851f85e59c113f6c45f07d035af4242a95aed5cc117fb83414f3c82e54b0721a277689810f90f55f703e4068a37abf70b6246215d00ee3ecb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ipaex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-ipaex-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
