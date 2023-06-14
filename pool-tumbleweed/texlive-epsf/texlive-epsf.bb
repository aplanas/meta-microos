SUMMARY = "Simple macros for EPS inclusion"
DESCRIPTION = "The original (and now obsolescent) graphics inclusion macros \
for use with dvips, still widely used by Plain TeX users (in \
particular). For LaTeX users, the package is nowadays (rather \
strongly) deprecated in favour of the more sophisticated \
standard LaTeX latex-graphics bundle of packages. (The \
latex-graphics bundle is also available to Plain TeX users, via \
its Plain TeX version.)"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.7.4svn21461"

RPM_NAME = "texlive-epsf-2023.201.2.7.4svn21461-53.1.noarch.rpm"
RPM_HASH = "eb62d2a23477c61f98fca5cef6ebc101b2c77a6277fbc08a212deaf28190a26a49e5c722816c6fbde8b6a7ee434e0c79275a35af01b2f198238379a3df46aa34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epsf.sty \
tex-epsf.tex \
texlive-epsf"

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
