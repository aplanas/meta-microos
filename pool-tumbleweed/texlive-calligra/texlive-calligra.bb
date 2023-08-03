SUMMARY = "Calligraphic font"
DESCRIPTION = "A calligraphic font in the handwriting style of the author, \
Peter Vanroose. The font is supplied as Metafont source. LaTeX \
support of the font is provided in the calligra package in the \
fundus bundle."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-calligra-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "d6c6a97b0dd2f819f85f36ca2b53d755b6830bb573acd3cfc2dd7d757e0e69a313280e3593eddb25d34f0771ffd5f982d1e92222c064b4e0b0464e5a2ac26eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-callig15.tfm \
texlive-calligra"

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
