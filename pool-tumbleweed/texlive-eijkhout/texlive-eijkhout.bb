SUMMARY = "Victor Eijkhout's packages"
DESCRIPTION = "Three unrelated packages: DB_process, to parse and process \
database output; CD_labeler, to typeset user text to fit on a \
CD label; and repeat, a nestable, generic loop macro."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-eijkhout-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "68ed47aa7a2adf3827bb41b954a8ed3e4cb956bf299ce00ee644d209618a127fcea681d89ec5f76b609dc523fc9b94b6568b0ae1f02ecb07ffaab5dc91b3cb5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CD-labeler-test.tex \
tex-CD-labeler.tex \
tex-DB-process.tex \
tex-repeat.tex \
texlive-eijkhout"

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
