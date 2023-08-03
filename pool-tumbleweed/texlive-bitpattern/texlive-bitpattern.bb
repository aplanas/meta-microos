SUMMARY = "Typeset bit pattern diagrams"
DESCRIPTION = "A package to typeset bit pattern diagrams such as those used to \
describe hardware, data format or protocols."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn39073"

RPM_NAME = "texlive-bitpattern-2023.209.svn39073-53.1.noarch.rpm"
RPM_HASH = "dac3ced50badb4107944dd7cd1870ec02e336c2f1bee4b9759061703a678ac3d5067cbb94b301d9daa3d2968b519c1c4bec18695e2d01da19fdb064c483f8f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bitpattern.sty \
texlive-bitpattern"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-keyval.sty \
tex-multido.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
