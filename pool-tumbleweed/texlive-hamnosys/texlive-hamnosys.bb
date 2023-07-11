SUMMARY = "A font for sign languages"
DESCRIPTION = "The Hamburg Notation System, HamNoSys for short, is a system \
for the phonetic transcription of signed languages. This \
package makes HamNoSys available in XeLaTeX and LuaLaTeX. The \
package provides a Unicode font for rendering HamNoSys symbols \
as well as three methods for entering them."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.3svn61941"

RPM_NAME = "texlive-hamnosys-2023.201.1.0.3svn61941-53.2.noarch.rpm"
RPM_HASH = "8b72f93e01c7d0c20bf9c9bd762aedb42ebe1038cfa1c75260d72335c785eaae5bc410ef85bd6cc9a467a242cf5230317872b96cfbc4fc7b392bacdc344f7869"
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
