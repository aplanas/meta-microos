SUMMARY = "IPA (Japanese) fonts"
DESCRIPTION = "The fonts provide fixed-width glyphs for Kana and Kanji \
characters, proportional width glyphs for Western characters."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-ipaex-2023.209.svn61719-56.1.noarch.rpm"
RPM_HASH = "3967ca362ca9a0eb8335914a77eb6afa3b533d081883ca7a6f138ec010813d84725acc061ac28315f4de151286c0ec432636299d85b7b2131166e8801ef6210a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ipaex"

RDEPENDS:${PN} += "/usr/bin/sh \
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
