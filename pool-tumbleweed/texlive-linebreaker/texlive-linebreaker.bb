SUMMARY = "Prevent overflow boxes with LuaLaTeX"
DESCRIPTION = "This package tries to prevent overflow lines in paragraphs or \
boxes. It changes LuaTeX's \\linebreak callback and re-typesets \
the paragraph with increased values of \\tolerance and \
\\emergencystretch until the overflow no longer happens. If that \
doesn't help, it chooses the solution with the lowest badness."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1bsvn66461"

RPM_NAME = "texlive-linebreaker-2023.201.0.0.1bsvn66461-54.1.noarch.rpm"
RPM_HASH = "a933f30e756878f50c8a3e3c708328871570cb6f083f0d24cf9cd53e3ee790470212d970fe2d2da6839b7f41fef7bda1ef53d66cb47872549761f5f2b1fd58a1"
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
