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

PV = "2023.209.1.3svn29579"

RPM_NAME = "texlive-dashrule-2023.209.1.3svn29579-55.1.noarch.rpm"
RPM_HASH = "6acc50bb78a2f4e876b97e2aa588f1ead5ac8009e18349b0bbdb47116fab7892a5649a09db2804bd8fd15b8371521df7ad96642919e15e2dd0159ee81de93918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dashrule.sty \
texlive-dashrule"

RDEPENDS:${PN} += "/usr/bin/sh \
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
