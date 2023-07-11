SUMMARY = "Additional macros for Plain TeX and LaTeX in LuaTeX"
DESCRIPTION = "The package provides a coherent extended programming \
environment for use with LuaTeX. It loads packages fontspec, \
luatexbase and lualibs, and provides additional user-level \
features and goodies. The package is under development, and its \
specification may be expected to change."
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.1.0.1svn20747"

RPM_NAME = "texlive-luatextra-2023.208.1.0.1svn20747-53.1.noarch.rpm"
RPM_HASH = "8aefe0795898b0658668ce50e32775f5fcd2b6b2393b47303f85a4ae2a709d6e0e704cef0d5d48fcbc02fae43c7aedae8e01787847caae97eea851f552c5547a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatextra.sty \
texlive-luatextra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fixltx2e.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-luacode.sty \
tex-luatexbase.sty \
tex-metalogo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
