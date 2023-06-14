SUMMARY = "Display numbers in maths mode according to ISO 31-0"
DESCRIPTION = "The package makes a quick hack to ziffer to display numbers in \
maths mode according to ISO 31-0, regardless of input format \
(European $1.235,7$ or Anglo-American $1,235.7$). The options \
[euro, anglo] control the global input format. Default input \
format is anglo. Documentation is included as comments to the \
text source."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn17362"

RPM_NAME = "texlive-isonums-2023.201.1.0svn17362-55.1.noarch.rpm"
RPM_HASH = "b495e2eea3b2808674acefc0a84b5cd358d540b3812893568e603fe9781ab92164caed5086513d213e3d1c31adb10676bc6c799b59e28e0b188a8ac013f794d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-isonums.sty \
texlive-isonums"

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
