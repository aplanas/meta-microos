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

RPM_NAME = "texlive-epsf-2023.201.2.7.4svn21461-53.2.noarch.rpm"
RPM_HASH = "e15956bfa5c504c220aee3358165b01ada08a97e4ca8e019d6b7a211d4310722c3f8267bdff5d5a2fb8a06e04064d7a2123b80a04d9f62126c87a6440c6bb9cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epsf.sty \
tex-epsf.tex \
texlive-epsf"

RDEPENDS:${PN} += "/usr/bin/sh \
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
