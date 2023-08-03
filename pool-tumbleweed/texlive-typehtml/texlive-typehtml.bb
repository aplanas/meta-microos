SUMMARY = "Typeset HTML directly from LaTeX"
DESCRIPTION = "Can handle almost all of HTML2, and most of the math fragment \
of the draft HTML3."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17134"

RPM_NAME = "texlive-typehtml-2023.209.svn17134-53.1.noarch.rpm"
RPM_HASH = "8a52b36f8f8d54c8b6638e6416baeb064defd7201a2b8f2147b88bc7acb9969836a902004d283ec83431114eee9df90958d9b1e20787683c8cde5d79d6daf3e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typehtml.sty \
texlive-typehtml"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-exscale.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
