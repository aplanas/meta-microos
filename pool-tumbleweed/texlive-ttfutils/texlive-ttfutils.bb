SUMMARY = "Convert TrueType to TFM and PK fonts"
DESCRIPTION = "Utilities: ttf2afm ttf2pk ttf2tfm ttfdump. FreeType is the \
underlying library."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-ttfutils-2023.209.svn66186-53.1.noarch.rpm"
RPM_HASH = "9ecc927960bcd252a372aa08e440b68509d64a56758df0622b050aca8a542a98ffbaf2f3131f55709f06c50d90975f061264d01ae507dbe6b136fe0b3483123c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-T1-WGL4.enc \
tex-ttf2pk.cfg \
texlive-ttfutils"

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
texlive-scripts-bin \
texlive-ttfutils-bin"

inherit rpm
