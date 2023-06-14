SUMMARY = "A font for sign languages"
DESCRIPTION = "The Hamburg Notation System, HamNoSys for short, is a system \
for the phonetic transcription of signed languages. This \
package makes HamNoSys available in XeLaTeX and LuaLaTeX. The \
package provides a Unicode font for rendering HamNoSys symbols \
as well as three methods for entering them."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-2023.201.1.0.3svn61941-53.1.noarch.rpm"
RPM_HASH = "3ed6590c6e0cd185f9a232bf2fb602f45dd42dc8153b2b63cfc1383d5dd0e9de3aa90bc826cda0dca875e4110f291b972f4bf3eea351f080aa82a7e48631008f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hamnosys.sty \
texlive-hamnosys"

RDEPENDS:${PN} += "/bin/sh \
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
