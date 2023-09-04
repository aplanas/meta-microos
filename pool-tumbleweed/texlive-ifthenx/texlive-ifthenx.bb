SUMMARY = "Extra tests for \\ifthenelse"
DESCRIPTION = "The package extends the ifthen package, providing extra \
predicates for the package's \\ifthenelse command. The package \
is complementary to xifthen, in that they provide different \
facilities; the two may be loaded in the same document, as long \
as xifthen is loaded first."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1asvn25819"

RPM_NAME = "texlive-ifthenx-2023.209.0.0.1asvn25819-54.1.noarch.rpm"
RPM_HASH = "b936ada339b20a068d18d84bbc4476e2d62d06daa6b1ab24482dbfce435bf6846cc4b243bc0d74af164e7aaeb5dc9236b50a964c1277e31c8a38ffac46831667"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifthenx.sty \
texlive-ifthenx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
