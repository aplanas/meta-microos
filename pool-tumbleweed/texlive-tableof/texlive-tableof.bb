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

PV = "2023.209.1.4csvn59837"

RPM_NAME = "texlive-tableof-2023.209.1.4csvn59837-58.1.noarch.rpm"
RPM_HASH = "3eed3b2e3f5d86db0781f472c1c08ea1fc21b390c579023698aa311eb245cb7a8d64f411eec4c54011cb2fe536a1e99b0455563d0ac651e084095c3c38efd0ec"
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
