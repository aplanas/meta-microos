SUMMARY = "FIFO and stack implementation for package writers"
DESCRIPTION = "A LaTeX implementation of a combined FIFO Stack modified from \
the existing stack package by Benjamin Bayart. The package \
renames the original's \\Push and \\Pop commands \\FSPush and \
\\FSPop, and which work on the top/end of the FIFO/Stack), and \
adds the ability to \\FSUnshift and \\FSShift from the bottom \
(front) of the FIFO/Stack."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn33288"

RPM_NAME = "texlive-fifo-stack-2023.201.1.0svn33288-52.1.noarch.rpm"
RPM_HASH = "e40c972289c53b0e0d9ffabd76ff1e9cfeb27bd45147c0bb201396d8d786fd040b028b2c38fe0d39baa2a74ca4ee23de076ed52211c60b743ac49e3df8dcb2a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fifo-stack.sty \
texlive-fifo-stack"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
