SUMMARY = "An 'end of proof' sign"
DESCRIPTION = "This package provides an additional 'end of proof' sign. The \
command's name is \\wasserdicht."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55643"

RPM_NAME = "texlive-endofproofwd-2023.201.svn55643-53.1.noarch.rpm"
RPM_HASH = "f3a48148474a181ac9c2ace697d39f01f85eeff83063270bf884fb42580452671ed8394779bf26d1ffca1a994b22035e2c04751780bed50ee85e456455ac31cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endofproofwd.sty \
texlive-endofproofwd"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-import.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
