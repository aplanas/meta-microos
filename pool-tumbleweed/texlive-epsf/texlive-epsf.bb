SUMMARY = "Simple macros for EPS inclusion"
DESCRIPTION = "The original (and now obsolescent) graphics inclusion macros \
for use with dvips, still widely used by Plain TeX users (in \
particular). For LaTeX users, the package is nowadays (rather \
strongly) deprecated in favour of the more sophisticated \
standard LaTeX latex-graphics bundle of packages. (The \
latex-graphics bundle is also available to Plain TeX users, via \
its Plain TeX version.)"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.7.4svn21461"

RPM_NAME = "texlive-epsf-2023.209.2.7.4svn21461-54.1.noarch.rpm"
RPM_HASH = "866a20fac9de714ae080efccb1828c559ac69712b43521c5344e0582b81b8f349a6beee58f6f23eefbbf48378474aff6fd531bb30af5f666a98ec04f4a0c166b"
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
