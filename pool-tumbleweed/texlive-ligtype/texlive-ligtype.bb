SUMMARY = "Comprehensive ligature suppression functionalities"
DESCRIPTION = "This package suppresses inappropriate ligatures following \
specified rules. Both font and user kerning are applied \
correctly, and f-glyphs are automatically replaced with their \
short-arm variant (if available). Also there is an emphasis on \
speed. By default the package applies German language ligature \
suppression rules. With the help of options and macros it can \
be used for other languages as well. The package requires \
LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1bsvn63577"

RPM_NAME = "texlive-ligtype-2023.201.0.0.1bsvn63577-54.1.noarch.rpm"
RPM_HASH = "af4db03b6cca06dadb2ec587966c650ad8f7059b10ce6a873da2e53d178a233920984576cbf8d665ecea4896c240511db07fa56ea9fc69c1d7d6db0b80922166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ligtype.sty) \
texlive-ligtype"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
tex(luatexbase.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
