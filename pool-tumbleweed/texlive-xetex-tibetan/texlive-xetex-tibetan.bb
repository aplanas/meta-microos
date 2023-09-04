SUMMARY = "XeTeX input maps for Unicode Tibetan"
DESCRIPTION = "The package provides a map for use with Jonathan Kew's TECkit, \
to translate Tibetan to Unicode (range 0F00-0FFF)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn28847"

RPM_NAME = "texlive-xetex-tibetan-2023.209.0.0.1svn28847-53.2.noarch.rpm"
RPM_HASH = "7a73bbeab4279757e883da6a83fecea7a2a233145290e9b0a85e40e760298c60fe775f23d60e7f375fa32f2ac72acf2bfe13e916aa8a3d7920b8c623e0b3fc38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-loctib.map \
tex-wylie.map \
texlive-xetex-tibetan"

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
