SUMMARY = "International Modal Analysis Conference format"
DESCRIPTION = "A set of files for producing correctly formatted documents for \
the International Modal Analysis Conference. The bundle \
provides a LaTeX package and a BibTeX style file."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn17347"

RPM_NAME = "texlive-imac-2023.208.svn17347-53.1.noarch.rpm"
RPM_HASH = "5eff3fb9a089b6bc68babd0f9920e3e9a49edb45e413af334a1d2d9552deeda16be5eacca781291629c589d1d72b8466a8141d2de8a21d71827e89c82d944caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-imac.sty \
texlive-imac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-cite.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
