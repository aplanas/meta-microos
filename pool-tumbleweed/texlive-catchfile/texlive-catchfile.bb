SUMMARY = "Catch an external file into a macro"
DESCRIPTION = "This package catches the contents of a file and puts it in a \
macro. It requires e-TeX. Both LaTeX and plain TeX are \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn53084"

RPM_NAME = "texlive-catchfile-2023.209.1.8svn53084-53.1.noarch.rpm"
RPM_HASH = "3fd59274f1b80dbce131a0ce14a452de744a2cde1fbbeaf146864eac3275c440cb8e9d350ad82fefe882b80588c8243b475a796d48a47da08f6d86df5f7bf488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-catchfile.sty \
texlive-catchfile"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etexcmds.sty \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
