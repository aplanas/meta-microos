SUMMARY = "Interactive use of \\includeonly"
DESCRIPTION = "The package asks the user which files to put in a \\includeonly \
command. There is provision for answering 'same as last time' \
or 'all files'."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn54725"

RPM_NAME = "texlive-askinclude-2023.201.2.7svn54725-53.1.noarch.rpm"
RPM_HASH = "0c821abb319d089dfcbaab27cce35011d233ac0528d4d2af670a82c4b84360e55db21fc438bf9e3e07389c5d37f3de996b5d17a7f090060b9b3cd480a2c61038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-askinclude.sty \
texlive-askinclude"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvsetkeys.sty \
tex-makematch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
