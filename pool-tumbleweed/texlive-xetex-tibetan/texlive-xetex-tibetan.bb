SUMMARY = "XeTeX input maps for Unicode Tibetan"
DESCRIPTION = "The package provides a map for use with Jonathan Kew's TECkit, \
to translate Tibetan to Unicode (range 0F00-0FFF)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn28847"

RPM_NAME = "texlive-xetex-tibetan-2023.209.0.0.1svn28847-53.1.noarch.rpm"
RPM_HASH = "e31bb85dc880786cca2e48c0ba42480cc472d252e05f3e888e399765417ea954ba637341b1842fb97137c17687c39400a5318bcfda5b887476e6eb0c5ba61c31"
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
