SUMMARY = "A command to reproduce the flag of the European Union"
DESCRIPTION = "This LaTeX package implements a command to reproduce the \
official flag of the European Union (EU). The flag is \
reproduced at 1em high based on the current font size, so it \
can be scaled arbitrarily by changing the font size."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn55265"

RPM_NAME = "texlive-euflag-2023.209.0.0.8svn55265-53.1.noarch.rpm"
RPM_HASH = "b41bd723cf2e2925550da941624dae16a82f4c9b21422566b0336950a00f269562192c9dcf35b486349c445e377b9904c4b866e04634dce7788992fbe7845ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euflag.sty \
texlive-euflag"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-graphicx.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
