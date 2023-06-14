SUMMARY = "Shadow boxes"
DESCRIPTION = "Defines a command \\shabox (analgous to \\fbox), and supporting \
mechanisms."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20312"

RPM_NAME = "texlive-shadow-2023.201.svn20312-53.1.noarch.rpm"
RPM_HASH = "0e466bd109913918a6c48679303781e2ab1466ebb5bda1a4c7ede72ddac2a05e599fc0cef020bfea41549b4736d9076c599850328a5d8988e30a7a1c757a6571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-shadow.sty \
texlive-shadow"

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
