SUMMARY = "Hypertext tools for use with LaTeX"
DESCRIPTION = "The bundle provides three packages: texlinks: shorthand macros \
for TeX-related external hyperlinks with hyperref, the blog \
package in the present bundle, etc; hypertoc: adjust the \
presentation of coloured frames in hyperref tables of contents \
(article class only); blog: fast generation of simple HTML by \
expanding LaTeX macros, using the fifinddo package."
LICENSE = "LPPL-1.0"

PV = "2023.201.r0.83svn38815"

RPM_NAME = "texlive-morehype-2023.201.r0.83svn38815-54.1.noarch.rpm"
RPM_HASH = "f04549610779e102a65344b9bd3e8a638ea269059b4619247da93e7eb828235362caa356ccd38f408fd04330e33dbf90c8ba963209ba2a7199e16f1ec209818f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(blog.sty) \
tex(blogdot.cfg) \
tex(blogdot.sty) \
tex(blogexec.sty) \
tex(blogligs.sty) \
tex(hypertoc.sty) \
tex(lnavicol.sty) \
tex(markblog.sty) \
tex(texlinks.sty) \
texlive-morehype"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(domore.sty) \
tex(dowith.sty) \
tex(fifinddo.sty) \
tex(langcode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
