SUMMARY = "Allow line breaks within \\verb and verbatim output"
DESCRIPTION = "LaTeX's \\verb macro treats its argument as an unbreakable unit \
of text. This can lead to poor typesetting, especially when the \
argument is long. The spverbatim package provides an \\spverb \
macro that is analogous to \\verb and an spverbatim environment \
that is analogous to verbatim with the difference being that \
\\spverb and spverbatim allow LaTeX to break lines at space \
characters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-spverbatim-2023.201.1.0svn15878-57.1.noarch.rpm"
RPM_HASH = "1b0c341f065578b3d505b504a9724f9156b0444f7940e426bce98952d19bfc073aa60b13accf6195d2327398a7a669e0993c0accd6e4ec9bca045f1007e4a963"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(spverbatim.sty) \
texlive-spverbatim"

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
