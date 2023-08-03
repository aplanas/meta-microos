SUMMARY = "FIFO and stack implementation for package writers"
DESCRIPTION = "A LaTeX implementation of a combined FIFO Stack modified from \
the existing stack package by Benjamin Bayart. The package \
renames the original's \\Push and \\Pop commands \\FSPush and \
\\FSPop, and which work on the top/end of the FIFO/Stack), and \
adds the ability to \\FSUnshift and \\FSShift from the bottom \
(front) of the FIFO/Stack."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn33288"

RPM_NAME = "texlive-fifo-stack-2023.209.1.0svn33288-53.1.noarch.rpm"
RPM_HASH = "1d1a3a2497ae62e7177f996b8f17122f3b7f312ea00d98a9afb4f6c847086ac72c1298c151a917a25278812cd0eb8a4c7f0b0d7b952bd5cbfe5effeb3c16e856"
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
