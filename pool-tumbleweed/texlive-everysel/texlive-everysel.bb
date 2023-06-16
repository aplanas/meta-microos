SUMMARY = "Provides hooks into \\selectfont"
DESCRIPTION = "The package provided hooks whose arguments are executed just \
after LaTeX has loaded a new font by means of \\selectfont. It \
has become obsolete with LaTeX versions 2021/01/05 or newer, \
since LaTeX now provides its own hooks to fulfill this task. \
For newer versions of LaTeX everysel only provides macros using \
LaTeX's hook management due to compatibility reasons. See \
lthooks-doc.pdf for instructions how to use lthooks instead of \
everysel."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn57489"

RPM_NAME = "texlive-everysel-2023.201.2.1svn57489-52.1.noarch.rpm"
RPM_HASH = "8202c2f8b9d78e93425e6149d9b770bd5bb7049f4c7a6467de79494ac7e78f853b4f2b24434881bf2f0afe126bd4652bffe1f76342ab9bb6365cfc26e5cb3981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everysel-2011-10-28.sty \
tex-everysel.sty \
texlive-everysel"

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
