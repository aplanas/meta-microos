SUMMARY = "Hypertext tools for use with LaTeX"
DESCRIPTION = "The bundle provides three packages: texlinks: shorthand macros \
for TeX-related external hyperlinks with hyperref, the blog \
package in the present bundle, etc; hypertoc: adjust the \
presentation of coloured frames in hyperref tables of contents \
(article class only); blog: fast generation of simple HTML by \
expanding LaTeX macros, using the fifinddo package."
LICENSE = "LPPL-1.0"

PV = "2023.209.r0.83svn38815"

RPM_NAME = "texlive-morehype-2023.209.r0.83svn38815-55.1.noarch.rpm"
RPM_HASH = "91f92cf1dde397e5d95793c211d9a484493973953fe1599cbab6c21e38aab11f818016320c41dba075f23c60667dc3c9577638c7cc6176959a01236ef9d0674c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blog.sty \
tex-blogdot.cfg \
tex-blogdot.sty \
tex-blogexec.sty \
tex-blogligs.sty \
tex-hypertoc.sty \
tex-lnavicol.sty \
tex-markblog.sty \
tex-texlinks.sty \
texlive-morehype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-domore.sty \
tex-dowith.sty \
tex-fifinddo.sty \
tex-langcode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
