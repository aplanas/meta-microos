SUMMARY = "The package provides support for terminal-based menus using expl3"
DESCRIPTION = "When writing programs, it's often required to present the user \
with a list of options/actions. The user is then expected to \
select one of these options for the program to process. \
termmenu provides this mechanism for TeX. It requires only \
expl3 support, thus the l3kernel and l3packages are both \
required."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn37700"

RPM_NAME = "texlive-termmenu-2023.201.svn37700-54.1.noarch.rpm"
RPM_HASH = "6cbb19ae3e7519793bf0abc5e919acf03bd596850aa2a3d1bdc2bebc449aec10ec7d89abc19212c283e568954df058cabfb09e536e46cc7a80c4f6852e886655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(termmenu.tex) \
texlive-termmenu"
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
