SUMMARY = "An easy and flexible way to set watermarks"
DESCRIPTION = "This package can flexibly set and clear watermarks. It is based \
on everypage and TikZ, encapsulated by LaTeX3. All watermark \
content is placed inside a TikZ node in the center of the page."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn63656"

RPM_NAME = "texlive-magicwatermark-2023.201.1.0.1svn63656-52.1.noarch.rpm"
RPM_HASH = "dc7bbab40d6f7dbfee711e45d4437139ecddf06ab5b576cce6c703418e33efcb4c38898bb5c504822ca4d76cc89004d12b1ea43427e8aedaea3ab41bc43ee151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(magicwatermark.sty) \
texlive-magicwatermark"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(everypage-1x.sty) \
tex(expl3.sty) \
tex(tikz.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
