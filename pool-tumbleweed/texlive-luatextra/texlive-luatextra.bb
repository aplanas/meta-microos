SUMMARY = "Additional macros for Plain TeX and LaTeX in LuaTeX"
DESCRIPTION = "The package provides a coherent extended programming \
environment for use with LuaTeX. It loads packages fontspec, \
luatexbase and lualibs, and provides additional user-level \
features and goodies. The package is under development, and its \
specification may be expected to change."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0.1svn20747"

RPM_NAME = "texlive-luatextra-2023.201.1.0.1svn20747-52.1.noarch.rpm"
RPM_HASH = "243dcb25c50de732bc2e8bd5390bed3e0999cdbc1c980a8fbc5d1054a0885cd9976fdbc12187bc8d4f399cfcce565ea615aba74fecc4836a5d27b43c4d569ccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luatextra.sty) \
texlive-luatextra"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fixltx2e.sty) \
tex(fontspec.sty) \
tex(ifluatex.sty) \
tex(luacode.sty) \
tex(luatexbase.sty) \
tex(metalogo.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
