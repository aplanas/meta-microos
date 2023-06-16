SUMMARY = "Use LGR-encoded fonts in math mode"
DESCRIPTION = "The lgrmath package is a LaTeX package which sets the Greek \
letters in math mode to use glyphs from the LGR-encoded font of \
one's choice. The documentation includes a rather extensive \
list of the available font family names on typical LaTeX \
installations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65038"

RPM_NAME = "texlive-lgrmath-2023.201.1.0svn65038-54.1.noarch.rpm"
RPM_HASH = "612b747c609f24153e8875de81b25caf7bdade2fac0b7471ea1ed5745f46d0181d05ed76c64da468cabfaf4b48ae28ef37aec542a6a16ed3328f46d9a1ad89b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lgrmath.sty \
texlive-lgrmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
