SUMMARY = "Setting questions (or exercises) and answers"
DESCRIPTION = "The package allows a lot of flexibility in constructing \
question and answer sheets."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.16svn35032"

RPM_NAME = "texlive-answers-2023.209.2.16svn35032-55.1.noarch.rpm"
RPM_HASH = "86151798c5041834ef5d078267c309633196d1d4ee01ba3bbdcc75838237842ccc6564df0d85e5b6515ec745fa56838b6e86426da2d524f43be6a7b80528a0e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-answers.sty \
texlive-answers"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
