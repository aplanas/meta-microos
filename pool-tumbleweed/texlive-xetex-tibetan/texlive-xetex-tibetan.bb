SUMMARY = "XeTeX input maps for Unicode Tibetan"
DESCRIPTION = "The package provides a map for use with Jonathan Kew's TECkit, \
to translate Tibetan to Unicode (range 0F00-0FFF)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn28847"

RPM_NAME = "texlive-xetex-tibetan-2023.201.0.0.1svn28847-52.1.noarch.rpm"
RPM_HASH = "7ba3f41a03a2ca27eb83c1124bc9973ee43601bf79133f6d66bc3b0d97743831077d05283759156072046d85c952fa671d0d0e41e06ef125461c0df6552361a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-loctib.map \
tex-wylie.map \
texlive-xetex-tibetan"

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
