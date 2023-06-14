SUMMARY = "Literate programming package"
DESCRIPTION = "ProTeX is a simple but powerful literate programming tool, \
which is designed to generate useful hypertext output (either \
PDF, or HTML using TeX4ht)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn41633"

RPM_NAME = "texlive-protex-2023.201.svn41633-52.1.noarch.rpm"
RPM_HASH = "d15aac07d6746b8c71a36064e182bb0fa6b9572304bf00c1ae7864def2111061f66647533e9ecf581b52e83ee0d0a33b6afe5c6d5b89533c7c88f925f35b1e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-AlProTex.sty \
tex-ProTex.sty \
texlive-protex"

RDEPENDS:${PN} += "/bin/sh \
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
