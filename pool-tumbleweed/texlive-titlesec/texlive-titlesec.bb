SUMMARY = "Select alternative section titles"
DESCRIPTION = "A package providing an interface to sectioning commands for \
selection from various title styles. E.g., marginal titles and \
to change the font of all headings with a single command, also \
providing simple one-step page styles. Also includes a package \
to change the page styles when there are floats in a page. You \
may assign headers/footers to individual floats, too."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn59845"

RPM_NAME = "texlive-titlesec-2023.209.2.14svn59845-53.1.noarch.rpm"
RPM_HASH = "758d06235d424e94ea60e6ce19a4d705136f69e2a4ad85a838f9d50792a85b8940af8002c84c287b53a786452d83aab8bb0a2091b41ac7fea70ffa2d86819e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titleps.sty \
tex-titlesec.sty \
tex-titletoc.sty \
texlive-titlesec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
