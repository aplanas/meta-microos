SUMMARY = "A font for sign languages"
DESCRIPTION = "The Hamburg Notation System, HamNoSys for short, is a system \
for the phonetic transcription of signed languages. This \
package makes HamNoSys available in XeLaTeX and LuaLaTeX. The \
package provides a Unicode font for rendering HamNoSys symbols \
as well as three methods for entering them."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-2023.209.1.0.3svn61941-54.2.noarch.rpm"
RPM_HASH = "d2c6d6dc3aaaceac452d85c783a43b25d7ab5c8598e87b083650ee4eaad2690eb22bcdd0e3f7b832cb9b171f9aedc3c92762c23817244f51821ebfc97d4d6631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hamnosys.sty \
texlive-hamnosys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-ucharclasses.sty \
texlive \
texlive-filesystem \
texlive-hamnosys-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
