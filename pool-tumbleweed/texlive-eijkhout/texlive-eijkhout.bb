SUMMARY = "Victor Eijkhout's packages"
DESCRIPTION = "Three unrelated packages: DB_process, to parse and process \
database output; CD_labeler, to typeset user text to fit on a \
CD label; and repeat, a nestable, generic loop macro."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-eijkhout-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "f45085a1c101146ab8ba077a17cb529f8a961bef754ca8900ffbd75b9c7bd89553d3cb7e4517fad5604ddb255b08e7fb00a6412c21ef29209401e66d02cc476b"
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
