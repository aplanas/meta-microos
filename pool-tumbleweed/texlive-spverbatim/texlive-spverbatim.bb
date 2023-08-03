SUMMARY = "Allow line breaks within \\verb and verbatim output"
DESCRIPTION = "LaTeX's \\verb macro treats its argument as an unbreakable unit \
of text. This can lead to poor typesetting, especially when the \
argument is long. The spverbatim package provides an \\spverb \
macro that is analogous to \\verb and an spverbatim environment \
that is analogous to verbatim with the difference being that \
\\spverb and spverbatim allow LaTeX to break lines at space \
characters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-spverbatim-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "a7cb3d5bcebd2cea3f9c05b4179efe8a515bfb5ec6414c0426e0ac9d4574b6d59c21943f39652786058f18be0bf0a6dda64c69394ddb6033eeaeff11ac300378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spverbatim.sty \
texlive-spverbatim"

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
