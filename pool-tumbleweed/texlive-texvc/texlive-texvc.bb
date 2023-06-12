SUMMARY = "Use MediaWiki LaTeX commands"
DESCRIPTION = "User MediaWiki LaTeX commands to copy and past formulae from \
MediaWiki to LaTeX documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn46844"

RPM_NAME = "texlive-texvc-2023.201.1.1svn46844-54.1.noarch.rpm"
RPM_HASH = "1bedb5bbdfc5d089be84d47d6a97b3cb0210de0fe2ee9b8cc0eb66f54ff73e4acf0bdac508a7059d10f09bd12c83e3bd86733ecb91fed5b4fd5bac8ad5243eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(texvc.sty) \
texlive-texvc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(babel.sty) \
tex(cancel.sty) \
tex(color.sty) \
tex(eurosym.sty) \
tex(teubner.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
