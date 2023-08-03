SUMMARY = "A LaTeX git wrapper"
DESCRIPTION = "This package provides several macros to fetch git information \
and typeset it. The macros defined by LaTeXgit can be helpful \
to documentation authors and others to whom clear document \
versioning is important."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn54811"

RPM_NAME = "texlive-latexgit-2023.209.svn54811-55.1.noarch.rpm"
RPM_HASH = "f5ba9f142c0f8283b971951cdf9af2871fa76ab1ae8a3068cd938b67153d0bbd524a9f2d81e5e3b34b370b9565a1313deee7cda7ab4b009d689455de1a50a407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latexgit.sty \
texlive-latexgit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
