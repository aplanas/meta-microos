SUMMARY = "Unicode normalization support"
DESCRIPTION = "This package provides Unicode normalization (useful for \
composed characters) for LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn57257"

RPM_NAME = "texlive-uninormalize-2023.201.0.0.1svn57257-53.1.noarch.rpm"
RPM_HASH = "a02cf5fceb29014ca523738d80efe8595bc98c7ebab053901654c03cc642306d397c4697b45dc27782e3c0f5c910af370f4442da6b78793e746559da1264fa6b"
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
