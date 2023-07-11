SUMMARY = "XeTeX input maps for Unicode Tibetan"
DESCRIPTION = "The package provides a map for use with Jonathan Kew's TECkit, \
to translate Tibetan to Unicode (range 0F00-0FFF)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn28847"

RPM_NAME = "texlive-xetex-tibetan-2023.201.0.0.1svn28847-52.2.noarch.rpm"
RPM_HASH = "48685894356ca351c56823d60f354a9bc5492265726c1be5b3eb2fa7dd46ebae5bd677b72db255471d6e5ea63b7622fee128dc38cd4db9fd225674e75dc25624"
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
