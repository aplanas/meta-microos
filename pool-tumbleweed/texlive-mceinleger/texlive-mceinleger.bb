SUMMARY = "Creating covers for music cassettes"
DESCRIPTION = "A package for creating MC-covers on your own. It allows the \
creation of simple covers as well as covers with an additional \
page for more information about the cassette (table of contents \
e.g.). The rotating package is required."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-mceinleger-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "babd78df76eff8be460d47e02d68af219ab885986cfe1c46566d73672edbc5ae07d5646ba403c5ad0aeeb832836dd994e717e2f6799514064de33cbe2ca63012"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mceinleger.sty \
texlive-mceinleger"

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
