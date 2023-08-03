SUMMARY = "Avoid name clashes with e-TeX commands"
DESCRIPTION = "New primitive commands are introduced in e-TeX; sometimes the \
names collide with existing macros. This package solves the \
name clashes by adding a prefix to e-TeX's commands. For \
example, eTeX's \\unexpanded is provided as \\etex@unexpanded."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn53171"

RPM_NAME = "texlive-etexcmds-2023.209.1.7svn53171-53.1.noarch.rpm"
RPM_HASH = "26187eb97f7678696724c677754daad013b83ed6b2c3b34a62cd165514b0ac86ffb0e710a348cdd9b7a20e63f779dd85a0342a7b26c86170c7cd0fb806f06c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etexcmds.sty \
texlive-etexcmds"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-infwarerr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
