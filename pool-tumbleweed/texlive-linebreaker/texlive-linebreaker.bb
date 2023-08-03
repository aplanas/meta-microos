SUMMARY = "Prevent overflow boxes with LuaLaTeX"
DESCRIPTION = "This package tries to prevent overflow lines in paragraphs or \
boxes. It changes LuaTeX's \\linebreak callback and re-typesets \
the paragraph with increased values of \\tolerance and \
\\emergencystretch until the overflow no longer happens. If that \
doesn't help, it chooses the solution with the lowest badness."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1bsvn66461"

RPM_NAME = "texlive-linebreaker-2023.209.0.0.1bsvn66461-55.1.noarch.rpm"
RPM_HASH = "e527b217d27b7f3255789acfb3856af6debe260d80bc505c6a28cd5f8bb4277dd365a8da6fa40fd550908452fe07be528f4d6ffb56e4b82fc5266e2f9c25716a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linebreaker.sty \
texlive-linebreaker"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
