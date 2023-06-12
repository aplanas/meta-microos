SUMMARY = "Fira sans serif font with Unicode math support"
DESCRIPTION = "Fira Math is a sans-serif font with Unicode math support. The \
design of this font is based on Fira Sans and FiraGO. Fira Math \
is distributed in OpenType format and can be used with the \
unicode-math package under XeLaTeX or LuaLaTeX. More support is \
offered by the firamath-otf package."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.3.4svn56672"

RPM_NAME = "texlive-firamath-2023.201.0.0.3.4svn56672-52.1.noarch.rpm"
RPM_HASH = "77437fd23fad16f2a9e27715c56172f4707dabfe64545dff84bd09d4dce2085cd8172e8b371d2df666cd111bd583319f717e7f0e00adf962853275c65d44aecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firamath"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-firamath-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
