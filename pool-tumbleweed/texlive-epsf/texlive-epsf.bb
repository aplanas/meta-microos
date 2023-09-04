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

RPM_NAME = "texlive-epsf-2023.209.2.7.4svn21461-54.2.noarch.rpm"
RPM_HASH = "db0994512c23467e07f21d7eeb7dacd4d825c06feb78bd285d9709f8f24e211859e3b5723b36f4e9de05321a92b3fb44fbb34a68c499e27d9448185d8aac98cc"
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
