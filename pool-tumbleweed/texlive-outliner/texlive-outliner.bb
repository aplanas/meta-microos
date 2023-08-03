SUMMARY = "Change section levels easily"
DESCRIPTION = "Allows you to write '\\Level 2 {Some heading}' instead of the \
usual \\section stuff; the definitions of the levels can then \
easily be changed. There is a mechanism for shifting all \
levels. This makes it easy to bundle existing articles into a \
compilation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.94svn21095"

RPM_NAME = "texlive-outliner-2023.209.0.0.94svn21095-55.1.noarch.rpm"
RPM_HASH = "e2f578eb118268ae7cc25eff25af9cf9b9feb2f2d9dabbe847c226a9f9585159f49f0965b3ff63eef7f4b5cd2b93368a596a15058efdf016f8e75d5a2f51d96e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-outliner.sty \
texlive-outliner"

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
