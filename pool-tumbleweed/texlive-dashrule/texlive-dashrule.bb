SUMMARY = "Draw dashed rules"
DESCRIPTION = "The dashrule package makes it easy to draw a huge variety of \
dashed rules (i.e., lines) in LaTeX. dashrule provides a \
command, \\hdashrule, which is a cross between LaTeX's \\rule and \
PostScript's setdash command. \\hdashrule draws horizontally \
dashed rules using the same syntax as \\rule, but with an \
additional, setdash-like parameter that specifies the pattern \
of dash segments and the space between those segments. Because \
dashrule's rules are constructed internally using \\rule (as \
opposed to, e.g., PostScript \\specials) they are fully \
compatible with every LaTeX back-end processor."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.3svn29579"

RPM_NAME = "texlive-dashrule-2023.204.1.3svn29579-54.1.noarch.rpm"
RPM_HASH = "4c2add4be87afa81c34141779598624ab7fe48c41416c6155c55973ce1fb0322e55177102ca9d87e0a207bb6b32bd9cfdf55f2ac819b6806d059c4babe705588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dashrule.sty \
texlive-dashrule"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifmtarg.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
