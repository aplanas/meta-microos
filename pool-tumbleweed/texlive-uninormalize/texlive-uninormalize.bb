SUMMARY = "Unicode normalization support"
DESCRIPTION = "This package provides Unicode normalization (useful for \
composed characters) for LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn57257"

RPM_NAME = "texlive-uninormalize-2023.209.0.0.1svn57257-54.1.noarch.rpm"
RPM_HASH = "5a117bc6eae750ec408763a23afffe77dbbd051aec905449a09f484e47f086d7f85d18896a41c4a3151064d274bb8e7981129952f67bba9ec28b5ee3b0cefa9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uninormalize.sty \
texlive-uninormalize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-luacode.sty \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
