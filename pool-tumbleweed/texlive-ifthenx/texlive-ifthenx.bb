SUMMARY = "Extra tests for \\ifthenelse"
DESCRIPTION = "The package extends the ifthen package, providing extra \
predicates for the package's \\ifthenelse command. The package \
is complementary to xifthen, in that they provide different \
facilities; the two may be loaded in the same document, as long \
as xifthen is loaded first."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1asvn25819"

RPM_NAME = "texlive-ifthenx-2023.208.0.0.1asvn25819-53.1.noarch.rpm"
RPM_HASH = "8e11a1e0e4bbbc70dde192d86073148dbe9edb2b2146453628dd8008713a9d0367c2fb5170ad3116126e597e8289b2754f39badd47b473f2d1eab686abde6455"
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
