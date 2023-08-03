SUMMARY = "A font for sign languages"
DESCRIPTION = "The Hamburg Notation System, HamNoSys for short, is a system \
for the phonetic transcription of signed languages. This \
package makes HamNoSys available in XeLaTeX and LuaLaTeX. The \
package provides a Unicode font for rendering HamNoSys symbols \
as well as three methods for entering them."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-2023.209.1.0.3svn61941-54.1.noarch.rpm"
RPM_HASH = "975b622c574619deb6c0ce73c20993bcc2fd06f39da9a96795b9b31298e1fa5a78ac156b414a7555927cc9862db4c2572edca60f3443acc95a754f1c66fc2cea"
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
