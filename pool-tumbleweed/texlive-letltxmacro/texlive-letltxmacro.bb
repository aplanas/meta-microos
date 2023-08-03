SUMMARY = "Let assignment for LaTeX macros"
DESCRIPTION = "TeX's \\let assignment does not work for LaTeX macros with \
optional arguments or for macros that are defined as robust \
macros by \\DeclareRobustCommand. This package defines \
\\LetLtxMacro that also takes care of the involved internal \
macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn53022"

RPM_NAME = "texlive-letltxmacro-2023.209.1.6svn53022-55.1.noarch.rpm"
RPM_HASH = "3c645b7fa224447186d2f7837ed13232da518b73d7e9f1ba13d7cd125182c36aea860aef08520ca69fd42645448073f5570c5638da00e5c2acc918b1831d1128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-letltxmacro.sty \
texlive-letltxmacro"

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
