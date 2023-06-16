SUMMARY = "Tagging tables of contents"
DESCRIPTION = "The package provides the commands to flag chapters or sections \
(or anything else destined to become a TOC line). The command \
\\nexttocwithtags{req1,req2,...}{excl1,excl2,...} specifies \
which tags are to be required and which ones are to be excluded \
by the next \\tableofcontents (or equivalent) command. In a \
document that uses a class where \\tableofcontents may only be \
used once, the command \
\\tableoftaggedcontents{req1,req2,...}{excl1,excl2,...} may be \
used to provide several tables."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4csvn59837"

RPM_NAME = "texlive-tableof-2023.201.1.4csvn59837-57.1.noarch.rpm"
RPM_HASH = "392d6f721b8082e7e4357aa0d4466d9c7995261f8a00825fc903849fb5447eaf063b1e020b42b4b7b7dba004b507fb3e71df35bb1cc5b264bdb9b8f5d0c1fa60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tableof.sty \
texlive-tableof"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atveryend.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
