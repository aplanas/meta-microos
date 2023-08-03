SUMMARY = "Variants of \\show for LaTeX2e"
DESCRIPTION = "This small package aims at making debugging (especially in an \
interactive way) easier, by providing \\show variants suited to \
LaTeX2e commands (whether with optional arguments or robust) \
and environments. The variant commands also display the \
internal macros used by such commands, if any. The \\showcs \
variant helps with macros with exotic names."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-show2e-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "838f379816a5589423d1137402dd2b26c72c33d00cc13bbcc22e2d287c5e0d4782bb348fc687659df38add1bf0c0d6e9c4a85b058909bf03fb7c2898260ee984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-show2e.sty \
texlive-show2e"

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
